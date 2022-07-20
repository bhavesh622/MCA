class revword:
    def __init__(self,string="") -> None:
        self.string = string
    def _revword(self):
        stringarr = self.string.split()
        revstring = ""
        for i in stringarr[::-1]:
            revstring += i + " "
        return revstring
    def getReverse(self):
        print(self._revword())
s= revword("Hello World, this is everything")
s.getReverse()