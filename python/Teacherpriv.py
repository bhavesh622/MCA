class Teacher:
    def __init__(self,name,age,salary) -> None:
        self.name = name
        self.age = age
        self.__salary = salary
    def _getAge(self):
        print("Age is ",self.age)
    def _getName(self):
        print("Name is ",self.name)
    def _getSalary(self):
        print("Salary(not accessible otherwise) is: ",self.__salary)
t1 = Teacher("Test",54,50000)
t1._getAge()
t1._getName()
t1._getSalary()
print(t1.age)
print(t1.name)
# print(t1.__salary)