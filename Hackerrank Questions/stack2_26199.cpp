#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <stack>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   \
  string exp;
  stack<char> st;
  cin>>exp;
  if(exp.size() > 10) {
    cout<<"Stack Full";
    return 0;
  }
  for(auto ch:exp) {
    if(ch == '(') {
      st.push(ch);
    }
    else if(ch == ')' and !st.empty() and st.top() == '(') {
      st.pop();
    }
    else {
      cout<<"Not Balanced";
      return 0;
    }
  }
  if(st.empty())
    cout<<"Balanced";
  else
    cout<<"Not Balanced";
  return 0;
}
