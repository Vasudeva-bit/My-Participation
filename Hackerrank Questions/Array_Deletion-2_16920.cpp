#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++) {
        cin>>a[i];
    }
    for(int i=0;i<n-2;i++) {
        if(!(a[i] % 2 != 0 && a[i+1] % 2 != 0 && a[i+2] % 2 != 0))
            cout<<a[i]<<'\t';
    }
    cout<<a[n-2]<<'\t'<<a[n-1];
    return 0;
}
