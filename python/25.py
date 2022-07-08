with open("./python/test.txt","r+") as file:
    data = file.readlines()
    words = 0
    chars = 0
    lines = len(data)
    for line in data:
        words += len(line.split())
        print(line)
        word = line.split()
        print(word)    
        for char in word:
            chars += len(char)
print("No of chars: "+ str(chars))
print("No of words: "+ str(words))
print("No of lines "+ str(lines))