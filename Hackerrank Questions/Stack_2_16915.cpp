#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <stack>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    string st;
    stack<char> str;
    while(cin>>st) {
        for(auto ch:st) {
            str.push(ch);
        }
        str.push(' ');
    }
    str.pop();
    while(!str.empty()) {
        cout<<str.top();
        str.pop();
    }
    return 0;
}
