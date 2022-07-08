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
s1 = Staff("Staff1",24)
t1 = Teacher("Test","24")
t1._getAge()
t1._getName()

print(issubclass(t1.__class__,s1.__class__))
print(issubclass(s1.__class__,t1.__class__))

