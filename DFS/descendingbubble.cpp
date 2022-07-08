#include<iostream>
using namespace std;
int main(){
    int n;
    bool found = false;
    cout<<"Input size of array: "<<endl;
    cin>>n;
    int *a = new int[n];
    cout<<"Enter elements "<<endl;
    for(int i = 0; i<n; i++){
        cin>>a[i];
    }
    for(int j=0;j<n-1;j++){
        for(int i =n-1; i>j; i--){
            if(a[i-1]<a[i]){
                cout<<i-1<<"Element smaller than "<<i<<endl;
                swap(a[i],a[i-1]);
            }
        }
    }
    
    cout<<"Elements of descending sorted array are: "<<endl;
    for(int i=0; i<n; i++){
        cout<<a[i]<<endl;
    }

}