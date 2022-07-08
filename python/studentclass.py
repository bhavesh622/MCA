class Students:
    def __init__(self,name,age,grade):
        self.name = name
        self.age = age
        self.grade = grade
    def _getAge(self):
        print("Age is ",self.age)
    def _getName(self):
        print("Name is ",self.name)
    def _getGrade(self):
        print("Grade is ",self.grade)
s1 = Students(str(input("Enter name: ")), int(input("Enter age: ")),int(input("Enter grade: ")))
s1._getAge()
s1._getGrade()
s1._getName()
