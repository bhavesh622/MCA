
from disnake.ext import commands
from disnake.ext.commands import Context
import disnake
from helpers import checks


# Here we name the cog and create a new class for the cog.
class Welcome(commands.Cog, name="welcome-normal"):
    def __init__(self, bot):
        self.bot = bot

    @commands.Cog.listener()
    async def on_member_join(self,member:disnake.Member):
        print("Recognised that a member called " + member.name + " joined")
        embed=disnake.Embed(
            title="Welcome "+member.name+"!",
            description="We're so glad you're here!",
            color=disnake.Color.green()
        )
        ch= self.bot.get_channel(999577829463314502)
        await ch.send(embed=embed)
        role = disnake.utils.get(member.guild.roles, name="onjoin") #  Gets the member role as a `role` object
        await disnake.Member.add_roles(member, role) # Gives the role to the user
        print("Added role '" + role.name + "' to " + member.name)


# And then we finally add the cog to the bot so that it can load, unload, reload and use it's content.
def setup(bot):
    bot.add_cog(Welcome(bot))
