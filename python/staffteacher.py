class Staff:
    def __init__(self,name,age) -> None:
        self.name = name
        self.age = age
    def _getAge(self):
        print("Age is ",self.age)
    def _getName(self):
        print("Name is ",self.name)
class Teacher(Staff):
    pass
t1 = Teacher("Test","24")
t1._getAge()
t1._getName()
print(t1.__class__)
