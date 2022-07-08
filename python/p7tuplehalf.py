x = (1,2,3,4,5,6,7,8,9,10)
def tuplehalf(x):
    for i in x:
        if i==len(x)//2+1:
            print()
        print(i,end="")
tuplehalf(x)