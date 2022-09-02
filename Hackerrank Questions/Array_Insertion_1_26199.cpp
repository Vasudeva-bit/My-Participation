#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int a[8];
    int i = 0;
    while(cin>>a[i]) {
        i++;
    }
    int val;
    val = a[--i];
    int idx;
    idx = a[--i];
    i--;
    if(idx >= 0 && idx < 8) {
        int tem = i+1;
        while(tem > idx) {
            a[tem] = a[tem-1];
            tem--;
        }
        a[tem] = val;
        for(int x=0;x<i+1;x++) {
            cout<<a[x]<<",";
        }
        cout<<a[i+1];
    }
    else
        cout<<"Invalid Position";
    return 0;
}
