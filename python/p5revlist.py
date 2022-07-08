def revlist(x):
    return x[::-1]
x = input("Enter numbers for list, integers only, separated by space: ")
z = list(map(int,str.split(x," ")))
print("Reverse of the list is"), print(revlist(z))

        