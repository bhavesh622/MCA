def fib(n):
    if n ==0:
        return 1
    if n ==1:
        return 1
    elif n>1: 
        return fib(n-1) + fib(n-2)
x = int(input("Enter n: "))
print("Fibionnacci series up to " +str(x) + " is:")
for i in range(1,x+1):
    print(fib(i))