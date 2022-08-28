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
    if(n < 0 || n > 20) {
        cout<<"Invalid size of array";
        return 0;
    }
    char ele;
    if(n<0 || n>20) { cout<<"Invalid size of array";}
    else
    {
        while(cin>>ele){
            if('A' <= ele && ele <= 'Z') printf("%c %c ", ele, ele+32);
            else printf("%c ", ele);
        }
    }
    return 0;
}
