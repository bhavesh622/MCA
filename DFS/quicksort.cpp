#include <iostream>
using namespace std;
 
int partition(int a[], int st, int en){
    int pivot = a[st];
    int count = 0;
    for (int i = st + 1; i <= en; i++) {
        if (a[i] <= pivot)
            count++;
    }
 
    int pivotIndex = st + count;
    swap(a[pivotIndex], a[st]);
    int i = st, j = en;
    while (i < pivotIndex && j > pivotIndex) {
        while (a[i] <= pivot) {
            i++;
        }
        while (a[j] > pivot) {
            j--;
        }
        if (i < pivotIndex && j > pivotIndex) {
            swap(a[i++], a[j--]);
        }
    }
 
    return pivotIndex;
}
 
void quickSort(int arr[], int start, int end){
    if (start >= end)
        return;
    int p = partition(arr, start, end);

    quickSort(arr, start, p - 1);
    quickSort(arr, p + 1, end);
}
 
int main(){
    int n,key;
    cout<<"Input size of array: "<<endl;
    cin>>n;
    int *a = new int[n];
    cout<<"Enter elements : "<<endl;
    for(int i = 0; i<n; i++){
        cin>>a[i];
    }
    quickSort(a, 0, n - 1);
    cout<<"Sorted array using quicksort :"<<endl;
    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }
    return 0;
}