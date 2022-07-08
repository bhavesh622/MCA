def div(start,end):
    for i in range(start,end):
        if(i%7==0 and i%5!=0):
            print(str(i) + " is divisible by 7 but not 5")

div(1000,2000)