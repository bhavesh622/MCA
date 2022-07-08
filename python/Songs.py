class Songs:
    def __init__(self,lyrics=[]) -> None:
        self.lyrics = lyrics
    def sing_me_a_song(self):
        for i in self.lyrics:
            print(i)
s1= Songs(["Hello","It's","Me"])
s1.sing_me_a_song()