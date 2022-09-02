#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    // array size
    int n;
    cin>>n;
    int c = n;
    // no of elements in array
    int no;
    cin>>no;
    // declare the populate array
    int a[n];
    int i;
    for(i=0;i<n;i++) {
        cin>>a[i];
    }
    int ins;
    cin>>ins;
    cout<<n;
    int loc;
    if(ins < no)
        loc = no%ins;
    else
        loc = ins%no;
    for(i=no;i>loc;i++) {
        a[i] = a[i-1];
    }
    a[i+1] = ins;
    for(int i=0;i<n;i++) {
        cout<<a[i];
    }
    return 0;
}
