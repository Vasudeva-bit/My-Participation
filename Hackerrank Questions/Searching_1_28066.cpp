#include <bits/stdc++.h>
using namespace std;

int postIndex;

unordered_map<int, int> umap;
bool flag = false;
void findPre(int start, int end,
                vector<int> const &postorder,
                unordered_map<int, int> &map, stack<int> &stack) {
    if (start > end) {
        return;
    }
    int value = postorder[postIndex--];
    if(map.find(value) == map.end()) {
        flag = true;
        return;
    }
    int index = map[value];
    findPre(index + 1, end, postorder, map, stack);
    findPre(start, index - 1, postorder, map, stack);
    stack.push(value);
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    vector<int> pre;
    vector<int> post;
    vector<int> in;
    int val;
    while(cin>>val) {
        pre.push_back(val);
    }
    int len = int(pre.size()/3);
    for(int i=len;i<2*len;i++) {
        in.push_back(pre[i]);
    }
    for(int i=2*len;i<3*len;i++) {
        post.push_back(pre[i]);
    }
    for(int i=len;i<3*len;i++) {
        pre.pop_back();
    }
    
    for(int i=0;i<len;i++) {
        umap[in[i]] = i;
    }

    int n = len;
    postIndex = n-1;
    stack<int> st;
    findPre(0, n-1, post, umap, st);
    int i = 0;
    while(!st.empty()) {
        if(i < len and pre[i++] != st.top()) {
            cout<<"no";
            return 0;
        }
        if(flag) {
            cout<<"yes";
            return 0;
        }
        st.pop();
    }
    cout<<"yes";
    return 0;
}
