#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <iostream>
using namespace std;
int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++) {
        cin>>a[i];
    }
    int idx;
    cin>>idx;
    for(int i=0;i<n;i++) {
        if(i != idx)
            cout<<a[i];
    }
    return 0;
}
