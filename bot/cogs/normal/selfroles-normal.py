#Self role cog
from disnake.ext import commands
from disnake import PartialEmoji
import disnake


# Here we name the cog and create a new class for the cog.
class SelfRoles(commands.Cog, name="self-roles"):
    def __init__(self, bot):
        self.bot = bot
        self.role_message_id = 999603367246573568  # ID of the message that can be reacted to to add/remove a role.
        self.emoji_to_role = {
            PartialEmoji(name="🔴"): 999569588943605860,  # ID of the role associated with unicode emoji '🔴'.
            PartialEmoji(name="🟡"): 999588861460086786,  # ID of the role associated with unicode emoji '🟡'.
            PartialEmoji(
                name="green", id=0
            ): 0,  # ID of the role associated with a partial emoji's ID.
        }
    @commands.Cog.listener()
    async def on_raw_reaction_add(self, payload: disnake.RawReactionActionEvent):
        """Gives a role based on a reaction emoji."""
        print("Testing payload.")
        if payload.guild_id is None or payload.member is None:
            return

        # Make sure that the message the user is reacting to is the one we care about.
        if payload.message_id != self.role_message_id:
            return
        guild = self.bot.get_guild(payload.guild_id)
        if guild is None:
            # Check if we're still in the guild and it's cached.
            return

        try:
            role_id = self.emoji_to_role[payload.emoji]
        except KeyError:
            # If the emoji isn't the one we care about then exit as well.
            return

        role = guild.get_role(role_id)
        if role is None:
            # Make sure the role still exists and is valid.
            return

        try:
            # Finally, add the role.
            await payload.member.add_roles(role)
        except disnake.HTTPException:
            # If we want to do something in case of errors we'd do it here.
            pass
    @commands.Cog.listener()
    async def on_raw_reaction_remove(self, payload: disnake.RawReactionActionEvent):
        """Removes a role based on a reaction emoji."""
        if payload.guild_id is None:
            return
        # Make sure that the message the user is reacting to is the one we care about.
        if payload.message_id != self.role_message_id:
            return

        guild = self.bot.get_guild(payload.guild_id)
        if guild is None:
            # Check if we're still in the guild and it's cached.
            return

        try:
            role_id = self.emoji_to_role[payload.emoji]
        except KeyError:
            # If the emoji isn't the one we care about then exit as well.
            return

        role = guild.get_role(role_id)
        if role is None:
            # Make sure the role still exists and is valid.
            return

        # The payload for `on_raw_reaction_remove` does not provide `.member`
        # so we must get the member ourselves from the payload's `.user_id`.
        member = guild.get_member(payload.user_id)
        if member is None:
            # Make sure the member still exists and is valid.
            return

        try:
            # Finally, remove the role.
            await member.remove_roles(role)
        except disnake.HTTPException:
            # If we want to do something in case of errors we'd do it here.
            pass

# And then we finally add the cog to the bot so that it can load, unload, reload and use it's content.
def setup(bot):
    bot.add_cog(SelfRoles(bot))
