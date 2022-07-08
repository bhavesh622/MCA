from datetime import date
from pydoc import isdata
class person:
    def __init__(self,name,age) -> None:
        self.name = name
        self.age = age
    @classmethod
    def fromBirthYear(cls,name,year):
        return cls(name,date.today().year-year)
    @staticmethod
    def isAdult(age):
        return age>=18

person1= person("Anuj",21)
person2 = person.fromBirthYear("Anuj",2000)
print(person1.age)
print(person2.age)
print(person.isAdult(19))