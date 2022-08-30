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
    char a[n];
    int c = 0;
    if(n > 4 and n < 20) {
        for(int i=0;i<n;i++) {
            cin>>a[i];
            if(a[i] == 'W') {
                c++;
                cout<<i<<" ";
            }
        }
    }
    if(c == 0)
        cout<<-1<<endl<<0;
    else
        cout<<endl<<c;
    return 0;
}
