#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <stack>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    vector<int> preorder;
    for(int i=0;i<n;i++) {
        int val;
        cin>>val;
        preorder.push_back(val);
    }
    bool flag;
    stack<int> st;
    vector<int> out;
    for(int i=0, j=1;i<n;i++,j++) {
        flag = false;
        if(preorder[i] > preorder[j]) {
            st.push(preorder[i]);
        }
        else {
            while(!st.empty()) {
                if(preorder[j] > st.top()) {
                    st.pop();
                    flag = true;
                }
                else
                    break;
            }
        }
        if(flag) 
            out.push_back(preorder[i]);
    }
    out.push_back(preorder[n-1]);
    for(auto n:out) {
        cout<<n<<" ";
    }
    return 0;
}
