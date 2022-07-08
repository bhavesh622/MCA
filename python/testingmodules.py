import random
from testmodule import randommod
import testmodule.randommod
print(randommod.testrandom())
print(testmodule.randommod.testrandom())
print(random.random())
x= [0,1,2,3,4,5]
random.shuffle(x)
print(x)
