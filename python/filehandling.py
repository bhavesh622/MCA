import os
with open("./python/test.txt") as file:
    data = file.readlines()
    print(data)
for lines in data:
    print(lines)
    word = lines.split()
    # letters = word.split()
    print(word)
    print(type(word))
    # print(letters)
# lines = data.split("\n")
with open("./python/test.txt","a+") as file:
    file.write("appending data into the file")
    data = file.read()
    print(type(data))