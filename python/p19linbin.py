def linear_Search(list1, n, key):   
    for i in range(0, n):  
        if (list1[i] == key):  
            return i  
    return -1  
  
list1 = [1 ,3, 5, 4, 7, 9]  
key = 7  
  
n = len(list1) 
print("List is,",list1," and element to search is : ",key)
res = linear_Search(list1, n, key)  
if(res == -1):  
    print("Element not found")  
else:  
    print("Element found at index: ", res)  
 
def binary_search(list1, low, high, n):    
   if low <= high:  
      mid = (low + high) // 2    
      if list1[mid] == n:   
         return mid   
  
      elif list1[mid] > n:   
         return binary_search(list1, low, mid - 1, n)   
   
      else:   
         return binary_search(list1, mid + 1, high, n)   
  
   else:   
      return -1  
   
list1 = [12, 24, 32, 39, 45, 50, 54]  
n = 32  
print("List is,",list1," and element to search is : ",n)
res = binary_search(list1, 0, len(list1)-1, n)   
  
if res != -1:   
   print("Element is present at index", str(res))  
else:   
   print("Element is not present in list1")  