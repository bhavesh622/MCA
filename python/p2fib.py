def fib(n):
    if n ==0:
        return 1
    if n ==1:
        return 1
    elif n>1: 
        return fib(n-1) + fib(n-2)
n=0
sum=0
while(fib(n)<=1000):
    if(fib(n)%2==0):
        # print(n)
        # print(fib(n))
        sum+=fib(n)
    n+=1
print(sum)
    

