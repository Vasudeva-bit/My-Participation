#include <bits/stdc++.h>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    cin>>n;
    stack<int> st;
    int tem;
    if(n < 3)
        return 0;
    for(int i=0;i<n;i++) {
        cin>>tem;
        st.push(tem);
    }
    if(n%2 == 0) {
        int i = (n-1)/2;
        while(i > -1) {
            st.pop();
            i--;
        }
        cout<<st.top()<<endl;
        cout<<st.top();
    }
    else {
        int i = (n-1)/2;
        while(i > -1) {
            tem = st.top();
            st.pop();
            i--;
        }
        cout<<tem<<endl;
        cout<<st.top();
    }
    return 0;
}
