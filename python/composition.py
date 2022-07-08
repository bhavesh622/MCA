class Component:
    def __init__(self) -> None:
        print("Component class constructor called")
        
    def m1(self):
        print('Component class m1() method execution')

class Composite:
    def __init__(self) -> None:
        self.obj1= Component()
        print("Composite class object also created")
    def m2(self):
        print('Composite clas m2() method executed')
        self.obj1.m1()
        print("m1() called from composite class")

a = Composite()
a.m2()

