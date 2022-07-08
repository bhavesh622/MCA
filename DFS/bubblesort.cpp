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
    for(int j=n-1;j>=1;j--){
        for(int i = 0; i<j; i++){
            if(a[i]>a[i+1]){
                cout<<i<<"Element bigger than "<<i+1<<endl;
                swap(a[i],a[i+1]);
            }
        }
    }
    
    cout<<"Elements of sorted array are: "<<endl;
    for(int i=0; i<n; i++){
        cout<<a[i]<<endl;
    }

}