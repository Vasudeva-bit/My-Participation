#include <bits/stdc++.h>
using namespace std;

int insert(int n, unordered_map<int, int>& umap) {
    stack<int> st;
    for(int i=0;i<n;i++) {
        int tmp;
        cin>>tmp;
        st.push(tmp);
    }
    int tmp = 0;
    while(!st.empty()) {
        tmp += st.top();
        umap[tmp]++;
        st.pop();
        if(umap[tmp] >= 3) 
            return tmp;
    }    
    return 0;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int a, b, c;
    cin>>a>>b>>c;
    unordered_map<int, int> umap;
    cout<<insert(a, umap) + insert(b, umap) + insert(c, umap);
    return 0;
}
