#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <stack>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    string name;
    cin>>name;
    stack<char> st;
    for(char ch:name) {
        st.push(ch);
    }
    string tmp = "";
    while(!st.empty()) {
        tmp += st.top();
        st.pop();
    }
    if(name == tmp)
        cout<<"Palindrome";
    else
        cout<<"Not Palindrome";
    return 0;
}
