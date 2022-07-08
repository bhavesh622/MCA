#include<iostream>
using namespace std;
int main(){
    int n, min;
    bool found = false;
    cout<<"Input size of array: "<<endl;
    cin>>n;
    int *a = new int[n];
    cout<<"Enter elements "<<endl;
    for(int i = 0; i<n; i++){
        cin>>a[i];
    }
    for(int j=0;j<n-1;j++){
        min =j;
        for(int i = j+1; i<n; i++){
            if(a[min]>a[i]){
                min = i;    
                //cout<<j+1<<"Element bigger than "<<i+1<<endl;
               
            }
        }
        swap(a[min],a[j]);
    }
    
    cout<<"Elements of sorted array are: "<<endl;
    for(int i=0; i<n; i++){
        cout<<a[i]<<endl;
    }

}