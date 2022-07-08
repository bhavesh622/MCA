def cumulative_product():
    x = input("Enter numbers for list, integers only, separated by space: ")
    y = list(map(int,str.split(x," ")))
    print(y)
    print("The currently inputted list is: " + x)
    cur = 1
    for v in y:
        cur = (cur*v)
    # output= [(cur:=cur*v)for v in y]
    return(cur)
print(cumulative_product())