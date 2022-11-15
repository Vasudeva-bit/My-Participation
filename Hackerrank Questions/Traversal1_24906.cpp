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
    vector<int> postorder;
    for(int i=0;i<n;i++) {
        int val;
        cin>>val;
        postorder.push_back(val);
    }
    bool flag;
    stack<int> st;
    vector<int> out;
    out.push_back(postorder[0]);
    for(int i=0, j=1;i<n;i++,j++) {
        flag = false;
        if(postorder[i] < postorder[j]) {
            st.push(postorder[i]);
        }
        else {
            while(!st.empty()) {
                if(postorder[j] > st.top()) {
                    st.pop();
                    flag = true;
                }
                else
                    break;
            }
        }
        //cout<<postorder[i]<<" ";
        if(flag) 
            out.push_back(postorder[i]);
    }
    for(auto n:out) {
        cout<<n<<" ";
    }
    return 0;
}
