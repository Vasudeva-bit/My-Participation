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
    char ch;
    if(n%2 != 0)
        n++;
    for(int i=0;i<n/2;i++) {
        cin>>ch;
    }
    cout<<ch;
    return 0;
}
