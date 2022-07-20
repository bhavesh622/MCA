file = open("./python/test.txt", "r")
lines = 0
nwords = 0
characters = 0
for line in file:
    line = line.strip("\n")
    words = line.split()
    lines += 1
    nwords += len(words)
    characters += len(line)
file.close()
print("Lines:", lines, "\nWords:", nwords, "\nCharacters:", characters)