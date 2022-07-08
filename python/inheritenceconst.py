class person:
    def __init__(self,name,age) -> None:
        self.name = name
        self.age = age
    def _help(self):
        print(self.age)
    def __help(self):
        print(self.name)

class animal:
    def __init__(self,name,age) -> None:
        self.name1= name
        self.age1 = age
    def _help1(self):
        print(self.age1)
class student(person,animal):
    pass
    
    # def __init__(self, name, age) -> None:
    #     super().__init__(name, age)
    #     # animal.__init__(self,name,age)
s1 = student("Bhav",52)
s1._help()
s1._help1()
# s1.__class__.__help()
print(s1.__dict__)