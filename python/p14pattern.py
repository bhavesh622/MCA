n = int(input("Enter Number of Rows for number pattern: "))
n-=1
temp = n-1
for i in range(n):
    print("", end = "\n\t")
    print(" " * temp, end=" ")
    temp-=1
    for j in range(n):
        if(i>=j):
            print (i+1-j, end = " ")
        else:
            print ("", end = "")
    for j in range(n-1):
        if(i>=j+1):
            print (j+2, end = " ")
print("\n\n")
k = int(input("Enter number of rows for star pattern: "))
cnt = 0
temp= 1
while(cnt!=k):
    print("\t"+" "*(k-temp) + "* " * temp)
    if(cnt< k/2-1):
        temp+=2
    else:
        temp-=2
    cnt+=1
