#include<iostream>
using namespace std;
int main(){
    int n,temp,i;
    bool found = false;
    cout<<"Input size of array: "<<endl;
    cin>>n;
    int *a = new int[n];
    cout<<"Enter elements "<<endl;
    for(int i = 0; i<n; i++){
        cin>>a[i];
    }
    for(int j=1;j<n;j++){
        temp = a[j];
        i=j-1;
        while(temp<a[i]&&i>=0){
            a[i+1]= a[i];
            i= i-1;
                //cout<<j+1<<"Element bigger than "<<i+1<<endl;
        }
        a[i+1]= temp;
    }
    
    cout<<"Elements of sorted array are: "<<endl;
    for(int i=0; i<n; i++){
        cout<<a[i]<<endl;
    }

}