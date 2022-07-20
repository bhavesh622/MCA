def remwhitespace(strang,X):
    if(len(strang)==0): 
        return ""
    if (strang[0] == X):
        return remwhitespace(strang[1:],X)
    return strang[0] + remwhitespace(strang[1:], X)
print(remwhitespace(str(input("Enter string you want to remove spaces from: "))," "))
