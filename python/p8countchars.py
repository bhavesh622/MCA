def countchar(x):
    count = {}
    for i in x:
        if i in count:
            count[i]+=1
        else:
            count[i]=1
    print("Counts of all characters: \n",count)
countchar(input("Enter String: "))


        

