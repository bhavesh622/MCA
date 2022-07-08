#include<iostream>
using namespace std;
int main(){
    int n,key,lo,hi;
    bool found = false;
    cout<<"Input size of array: "<<endl;
    cin>>n;
    lo = 0;
    hi = n-1;
    int *a = new int[n];
    cout<<"Enter elements in sorted order: "<<endl;
    for(int i = 0; i<n; i++){
        cin>>a[i];
    }
    cout<<"Enter element to be found: "<<endl;
    cin>>key;
    while (lo <= hi &&(!found)) {
        int m = lo + (hi - lo) / 2;
        if (a[m] == key){
            found = true;
            cout<<"Element found at "<<(m+1)<<"th place with binary search"<<endl;
            break;
        }
        if (a[m] < key)
            lo = m + 1;
        else
            hi = m - 1;
    }
    if(!found){
        cout<<"Element not found with binary search!"<<endl;
    }
    return 0;
}