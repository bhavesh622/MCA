l = [10,20,30,40]
print(id(l))
l[1:2]= [3,4,5]
print(l)
l[1:1] = [3,4,5]
print(l)
l[1:3] = []
print(l)
print(l[-1::])
l.pop(5)
print(l)
list2 = l[:]
print(id(l))
print(id(list2))