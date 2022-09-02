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
    if(n <= 0 || n > 20) {
        cout<<"Invalid array size";
        return 0;
    }
    else {
        int a[n];
        int x = -1;
        int y = -1;
        int z = -1;
        for(int i=0;i<n;i++) {
            cin>>a[i];
            if(a[i] > x) {
                z = y;
                y = x;
                x = a[i];
            }
            else if(a[i] > y) {
                z = y;
                y = a[i];
            }
            else if(a[i] > z) {
                z = a[i];
            }
        }
        if(n < 3) 
            cout<<"Not sufficient elements";
        else
            cout<<z;
    }
    return 0;
}
