#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int a[10];
    for(int i=0;i<10;i++) {
        cin>>a[i];
    }
    int k;
    cin>>k;
    int i;
    for(i=0;i<10;i++) {
        if(a[i] == k)
            break;
    }
    if(i < 10)
        cout<<i+1;
    else
        cout<<"ELEMENT NOT FOUND";
    return 0;
}
