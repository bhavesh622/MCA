import math
print("\n\tSUM OF 1 – x^2/2! + x^4/4! -.... TO NTH TERM \n\n Enter x: ", end="")
x=int(input()) 
print(" Enter n: ", end="")
n=int(input())
sm=1
temp = 1
y = 2
for i in range(1,n):
    fact = 1
    for j in range(1,y+1):
        fact = fact * j
        temp *= (-1)
        subterm = temp * math.pow(x, y) / fact
        sm += subterm
        y += 2
print(" Sum of Series: " + '%.4f'% sm)