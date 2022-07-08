#include<iostream>
using namespace std;
int main(){
    int n,key;
    bool found = false;
    cout<<"Input size of array: "<<endl;
    cin>>n;
    int *a = new int[n];
    cout<<"Enter elements "<<endl;
    for(int i = 0; i<n; i++){
        cin>>a[i];
    }
    cout<<"Enter element to be found: "<<endl;
    cin>>key;
    for(int i = 0; i<n; i++){
        if(a[i]==key){
            cout<<"Element found at "<<i+1<<"th place "<<endl;
            found=true;
            break;
        }
    }
    if(!found){
        cout<<"Element not found with linear search!"<<endl;
    }
    return 0;
}