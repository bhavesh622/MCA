#Bubble sort
def bubblesrt(list):
    for iter_num in range(len(list)-1,0,-1):
        for idx in range(iter_num):
            if list[idx]>list[idx+1]:
                temp = list[idx]
                list[idx] = list[idx+1]
                list[idx+1] = temp
list = [19,2,31,45,6,11,121,27]
bubblesrt(list)
print("Bubble Sort : ")
print(list)
print()

#merger sort
def merge(arr, l, m, r):
    n1 = m - l + 1
    n2 = r - m
    L = [0] * (n1)
    R = [0] * (n2)
    for i in range(0, n1):
        L[i] = arr[l + i]
        for j in range(0, n2):
            R[j] = arr[m + 1 + j]
        i = 0
        j = 0
        k = l
        while i < n1 and j < n2:
            if L[i] <= R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1
            while i < n1:
                arr[k] = L[i]
                i += 1
                k += 1
                while j < n2:
                    arr[k] = R[j]
                    j += 1
                    k += 1
def mergeSort(arr, l, r):
    if l < r:
        m = l+(r-l)//2
        mergeSort(arr, l, m)
        mergeSort(arr, m+1, r)
        merge(arr, l, m, r)
arr = [19,2,31,45,6,11,121,27]
n = len(arr)
mergeSort(arr, 0, n-1)
print("\n\nSorted array is (Merge Sort) ")

for i in range(n):
    print("%d" % arr[i],end=" ")

# Insertion sort in Python

def insertionSort(array):
    for step in range(1, len(array)):
        key = array[step]
        j = step - 1
    while j >= 0 and key < array[j]:
        array[j + 1] = array[j]
        j = j - 1
        array[j + 1] = key

data = [19,2,31,45,6,11,121,27]
insertionSort(data)
print()
print()
print('Insertion sort : ')
print(data)

# Selection sort in Python

def selectionSort(array, size):
    for step in range(size):
        min_idx = step
        for i in range(step + 1, size):
            if array[i] < array[min_idx]:
                min_idx = i
        (array[step], array[min_idx]) = (array[min_idx],array[step])

data =[19,2,31,45,6,11,121,27]
size = len(data)
selectionSort(data, size)
print()
print()
print('Selection sort :')
print(data)
