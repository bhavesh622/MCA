//descending order selection sort
#include<iostream>
using namespace std;
int main(){
    int n, max;
    bool found = false;
    cout<<"Input size of array: "<<endl;
    cin>>n;
    int *a = new int[n];
    cout<<"Enter elements "<<endl;
    for(int i = 0; i<n; i++){
        cin>>a[i];
    }
    for(int j=0;j<n-1;j++){
        max =j;
        for(int i = j+1; i<n; i++){
            if(a[max]<a[i]){
                // cout<<a[min]<<"Element bigger than "<<a[i]<<endl;
                max = i; 
            }
        }
        swap(a[max],a[j]);
    }
    
    cout<<"Elements of descending sorted array are: "<<endl;
    for(int i=0; i<n; i++){
        cout<<a[i]<<endl;
    }

}