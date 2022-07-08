dis= {}
dis['testlist']= ['hello','this','is','a','list'],['1','2']
dis['testtuple'] = 1,2,3
dis['test']= 4
print(dis)
mlb = dict(
    col = 'rockies',
    boston = 'red sox'
)
print(mlb)
print (mlb.values())
print(mlb.items())
print(mlb.keys())
mlb.update({'col':'rockies1'})
print(mlb)
print(sorted(mlb,key= mlb.get))
# print(mlb.fromkeys())
print(mlb.popitem())
print(mlb)
mlb['test']= 'test1'
print(mlb)
sorting = dict(
    hello= "this",
    test = "is",
    an = "unsorted",
    example ="of",
    a = "list"
)
print(sorting.get("hello"))
print(sorted(sorting,key= sorting.get,reverse=True))