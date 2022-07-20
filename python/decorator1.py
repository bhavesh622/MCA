def inc(x):
    return x+1
def dec(x):
    return x-1
def operator(func,x):
    result = func(x)
    return result
print(operator(inc,21))
print(operator(dec,21))


#make_pretty returns inner function, not inner() function's value
def make_pretty(func):
    def inner():
        print("I'm decorated")
        func()
    return inner
    
@make_pretty
def ordinary():
    print("hello i am ordinary")

ordinary()

def smart_divide(func):
    def inner(a,b):
        print("Going to divide ",a," and ",b)
        if b==0:
                print("Cannot divide")
                return
        return func(a,b)
    return inner
@smart_divide
def divide(a,b):
    print(a/b)
divide(2,5)
divide(2,0)