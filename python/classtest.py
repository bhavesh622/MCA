class Complex_Number:
    'Complex number class'
    def __init__(self,i,a,r=0) -> None:
        self.real= r
        self.imag=i
        self.creat=a 
    # def __init__(self,i) -> None:
    #     self.imag= i
    def get_data(self):
        print(f'{self.real}+{self.imag}i')
    def printout(self):
        print("hello")
num1 = Complex_Number(2,3)
num1.get_data()
print (num1.imag)
del num1.real
# del num1.get_data
# print(num1.real)
# num2 = Complex_Number()
# num2.printout()
# del Complex_Number.printout
num1.printout()
print(num1.__dict__)
print(num1.__class__.__doc__)
print(num1.__class__.__name__)
print(num1.__module__)
print(num1.__class__.__bases__)
# print(num1.)