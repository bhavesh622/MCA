from cmath import pi
import math
class Circle:
    'Circle class for finding out area and perimeter'
    def __init__(self,radius=0) -> None:
        self.radius = radius
    def _area(self)-> float:
        return (pi*math.pow(self.radius,2))
    def _perimeter(self)->float:
        return (2*pi*self.radius)
    def getarea(self):
        print("Area of circle with radius " + str(self.radius)+" is :")
        print(self._area())
    def getperimeter(self):
        print("Perimeter of circle with radius " + str(self.radius) + " is: ")
        print(self._perimeter())
c = Circle(2)
c.getarea()
c.getperimeter()
c1 = Circle(3)
c1.getarea()
c1.getperimeter()