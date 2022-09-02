#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ \
    int n;
    cin>>n;
    int a[n+1];
    int idx = 0;
    int i;
    for(i=0;i<n;i++) {
        cin>>a[i];
        if(a[i] > a[idx])
            idx = i;
    }
    for(i=n;i>idx;i--) {
        a[i] = a[i-1];
    }
    int num;
    cin>>num;
    a[i+1] = num;
    for(int i=0;i<n+1;i++) {
        cout<<a[i]<<'\t';
    }
    return 0;
}
