#include <iostream>
using namespace std;
class Solution{
    public:
    int Max(int a, int b ){
        return(a>b?a:b);
    }
    long long maxSubArray(int arr[],int n){
        int cMax = arr[0];
        int gMax = arr[0];
        int i;
        for(i=1;i<n;i++)
        {
            cMax = Max(cMax+arr[i],arr[i]);
            gMax = Max(gMax,cMax);
        }
        return gMax;
    }
};
    int main(){
        int t,n;
        cin>>t;
        while(t--){
            cin>>n;
            int a[n];
            for(int i =0;i<n;i++)
                cin>>a[i];
            Solution ob;
            cout<<ob.maxSubArray(a,n)<<endl;
        }
        return 0;
    }


