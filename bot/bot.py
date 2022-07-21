
import json
import os
import platform
import random
import sys

import disnake
from disnake import ApplicationCommandInteraction, Guild
from disnake.ext import tasks, commands
from disnake.ext.commands import Bot
from disnake.ext.commands import Context
from matplotlib.style import context

import exceptions

if not os.path.isfile("config.json"):
    sys.exit("'config.json' not found! Please add it and try again.")
else:
    with open("config.json") as file:
        config = json.load(file)

intents = disnake.Intents.default()

#Enables prefix commands
intents.message_content = True 
intents.members= True

bot = Bot(command_prefix=commands.when_mentioned_or(config["prefix"]), intents=intents, help_command=None)

bot.config = config


@bot.event
async def on_ready() -> None:
    """
    The code in this even is executed when the bot is ready
    """
    print(f"Logged in as {bot.user.name}")
    print(f"disnake API version: {disnake.__version__}")
    print(f"Python version: {platform.python_version()}")
    print(f"Running on: {platform.system()} {platform.release()} ({os.name})")
    print("-------------------")
    status_task.start()


@tasks.loop(minutes=1.0)
async def status_task() -> None:
    """
    Setup the game status task of the bot
    """
    statuses = ["with you!","With space turtles!", "with humans!"]
    await bot.change_presence(activity=disnake.Game(random.choice(statuses)))


def load_commands(command_type: str) -> None:
    for file in os.listdir(f"./cogs/{command_type}"):
        if file.endswith(".py"):
            extension = file[:-3]
            try:
                bot.load_extension(f"cogs.{command_type}.{extension}")
                print(f"Loaded extension '{extension}'")
            except Exception as e:
                exception = f"{type(e).__name__}: {e}"
                print(f"Failed to load extension {extension}\n{exception}")


if __name__ == "__main__":
    """
    This will automatically load slash commands and normal commands located in their respective folder.
    
    """
    load_commands("slash")
    load_commands("normal")


@bot.event
async def on_message(message: disnake.Message) -> None:
    """
    The code in this event is executed every time someone sends a message.
    """
    if message.author == bot.user or message.author.bot:
        return
    await bot.process_commands(message)


@bot.event
async def on_slash_command(interaction: ApplicationCommandInteraction) -> None:
    """
    The code in this event is executed every time a slash command has been *successfully* executed
    """
    print(
        f"Executed {interaction.data.name} command in {interaction.guild.name} (ID: {interaction.guild.id}) by {interaction.author} (ID: {interaction.author.id})")


@bot.event
async def on_slash_command_error(interaction: ApplicationCommandInteraction, error: Exception) -> None:
    """
    The code in this event is executed every time a valid slash command catches an error.
    """
    if isinstance(error, exceptions.UserBlacklisted):
        """
        The code here will only execute if the error is an instance of 'UserBlacklisted', which can occur when using
        the @checks.is_owner() check.
        
        'hidden=True' will make so that only the user who execute the command can see the message
        """
        embed = disnake.Embed(
            title="Error!",
            description="You are blacklisted from using the bot.",
            color=0xE02B2B
        )
        print("A blacklisted user tried to execute a command.")
        return await interaction.send(embed=embed, ephemeral=True)
    elif isinstance(error, commands.errors.MissingPermissions):
        embed = disnake.Embed(
            title="Error!",
            description="You are missing the permission(s) `" + ", ".join(
                error.missing_permissions) + "` to execute this command!",
            color=0xE02B2B
        )
        print("A blacklisted user tried to execute a command.")
        return await interaction.send(embed=embed, ephemeral=True)
    raise error


@bot.event
async def on_command_completion(context: Context) -> None:
    """
    The code in this event is executed every time a normal command has been *successfully* executed
    :param context: The context of the command that has been executed.
    """
    full_command_name = context.command.qualified_name
    split = full_command_name.split(" ")
    executed_command = str(split[0])
    print(
        f"Executed {executed_command} command in {context.guild.name} (ID: {context.message.guild.id}) by {context.message.author} (ID: {context.message.author.id})")


@bot.event
async def on_command_error(context: Context, error) -> None:
    """
    The code in this event is executed every time a normal valid command catches an error.
    """
    if isinstance(error, commands.CommandOnCooldown):
        minutes, seconds = divmod(error.retry_after, 60)
        hours, minutes = divmod(minutes, 60)
        hours = hours % 24
        embed = disnake.Embed(
            title="Hey, please slow down!",
            description=f"You can use this command again in {f'{round(hours)} hours' if round(hours) > 0 else ''} {f'{round(minutes)} minutes' if round(minutes) > 0 else ''} {f'{round(seconds)} seconds' if round(seconds) > 0 else ''}.",
            color=0xE02B2B
        )
        await context.send(embed=embed)
    elif isinstance(error, commands.MissingPermissions):
        embed = disnake.Embed(
            title="Error!",
            description="You are missing the permission(s) `" + ", ".join(
                error.missing_permissions) + "` to execute this command!",
            color=0xE02B2B
        )
        await context.send(embed=embed)
    elif isinstance(error, commands.MissingRequiredArgument):
        embed = disnake.Embed(
            title="Error!",
            # We need to capitalize because the command arguments have no capital letter in the code.
            description=str(error).capitalize(),
            color=0xE02B2B
        )
        await context.send(embed=embed)
    raise error
# @bot.event
# async def on_member_join(member:disnake.Member):
#     print("Recognised that a member called " + member.name + " joined")
#     try: 
#         await member.send(member, "Hello there!")
#         print("Sent message to " + member.name)
#     except:
#         print("Couldn't message " + member.name)
#     embed=disnake.Embed(
#         title="Welcome "+member.name+"!",
#         description="We're so glad you're here!",
#         color=disnake.Color.green()
#     )
#     ch= bot.get_channel(999577829463314502)
#     await ch.send(embed=embed)
#     role = disnake.utils.get(member.guild.roles, name="test") #  Gets the member role as a `role` object
#     await disnake.Member.add_roles(member, role) # Gives the role to the user
#     print("Added role '" + role.name + "' to " + member.name)

# Run the bot with the token

# class MyClient(disnake.Client):
#     def __init__(self, *args, **kwargs):
#         super().__init__(*args, **kwargs)
#         print("hello")
#         self.role_message_id = 999589163831664721  # ID of the message that can be reacted to to add/remove a role.
#         self.emoji_to_role = {
#             disnake.PartialEmoji(name="🔴" ): 999588861460086786,  # ID of the role associated with unicode emoji '🔴'.
#             disnake.PartialEmoji(name="🟡"): 0,  # ID of the role associated with unicode emoji '🟡'.
#             disnake.PartialEmoji(
#                 name="green", id=0
#             ): 0,  # ID of the role associated with a partial emoji's ID.
#         }
#     @bot.event
#     async def on_raw_reaction_add(self, payload: disnake.RawReactionActionEvent):
#         """Gives a role based on a reaction emoji."""
#         print(payload.guild_id)
#         if payload.guild_id is None or payload.member is None:
#             return

#         # Make sure that the message the user is reacting to is the one we care about.
#         if payload.message_id != self.role_message_id:
#             return

#         guild = self.get_guild(payload.guild_id)
#         if guild is None:
#             # Check if we're still in the guild and it's cached.
#             return

#         try:
#             role_id = self.emoji_to_role[payload.emoji]
#         except KeyError:
#             # If the emoji isn't the one we care about then exit as well.
#             return

#         role = guild.get_role(role_id)
#         if role is None:
#             # Make sure the role still exists and is valid.
#             return

#         try:
#             # Finally, add the role.
#             await payload.member.add_roles(role)
#         except disnake.HTTPException:
#             # If we want to do something in case of errors we'd do it here.
#             pass

#     async def on_raw_reaction_remove(self, payload: disnake.RawReactionActionEvent):
#         """Removes a role based on a reaction emoji."""
#         if payload.guild_id is None:
#             return
#         # Make sure that the message the user is reacting to is the one we care about.
#         if payload.message_id != self.role_message_id:
#             return

#         guild = self.get_guild(payload.guild_id)
#         if guild is None:
#             # Check if we're still in the guild and it's cached.
#             return

#         try:
#             role_id = self.emoji_to_role[payload.emoji]
#         except KeyError:
#             # If the emoji isn't the one we care about then exit as well.
#             return

#         role = guild.get_role(role_id)
#         if role is None:
#             # Make sure the role still exists and is valid.
#             return

#         # The payload for `on_raw_reaction_remove` does not provide `.member`
#         # so we must get the member ourselves from the payload's `.user_id`.
#         member = guild.get_member(payload.user_id)
#         if member is None:
#             # Make sure the member still exists and is valid.
#             return

#         try:
#             # Finally, remove the role.
#             await member.remove_roles(role)
#         except disnake.HTTPException:
#             # If we want to do something in case of errors we'd do it here.
#             pass
# client = MyClient(intents=intents)
bot.run(config["token"])
