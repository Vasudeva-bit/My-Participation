#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int x;
    int c=0;
    while(cin>>x) {
        if(x != -1) {
            if(x%2 != 0)
                c++;
        }
        else
            break;
    }
    if(c > 0)
        cout<<c;
    else
        cout<<"No odd number present";
    return 0;
}
