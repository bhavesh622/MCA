class Rectangle:
    'Rectangle class with length and breadth'
    def __init__(self,l=0,w=0) -> None:
        self.l = l
        self.w = w
    def _area(self) -> float:
        return self.l * self.w
    def getarea(self):
        print(self._area())

r= Rectangle(2.5,3)
r.getarea()