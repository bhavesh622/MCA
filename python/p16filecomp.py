print("\nCOMPARE 2 FILES AND PRINT TOTAL LINES\n\n", end="")
f1 = open("./python/file1.txt",'r')
f2 = open("./python/file2.txt",'r')
f1_lines = f1.readlines()
f2_lines = f2.readlines()
for i in range(len(f1_lines)):
    if f1_lines[i].lower() != f2_lines[i].lower():
        print(" Line " + str(i+1) + " doesn't match.""\n ------------------------""\n File1: " + f1_lines[i] +"\n File2:"+ f2_lines[i]+"\n")
    else:
        print(" Line "+str(i+1) + " Matches!" + "\n File 1 & 2: " + f1_lines[i] +"\n" )
count = len(f1_lines) + len(f2_lines)
print('\n Total Number of Lines: ', count)
f1.close()
f2.close()
