#include <bits/stdc++.h>
using namespace std;

int postIndex;

unordered_map<int, int> umap;

void findPre(int start, int end,
                vector<int> const &postorder,
                unordered_map<int, int> &map, stack<int> &stack) {
    if (start > end) {
        return;
    }
    int value = postorder[postIndex--];

    int index = map[value];
 
    findPre(index + 1, end, postorder, map, stack);
    findPre(start, index - 1, postorder, map, stack);
 
    stack.push(value);
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    vector<int> in;
    int val;
    while(cin>>val) {
        in.push_back(val);
    }
    if(in.size() < 6 or in.size() >20) {
        cout<<"Invalid input";
        return 0;
    }
    int len = int(in.size()/2);
    vector<int> post;
    for(int i=len;i<2*len;i++) {
        post.push_back(in[i]);
    }
    for(int i=len;i<2*len;i++) {
        in.pop_back();
    }
    swap(in, post);
    for(int i=0;i<len;i++) {
        umap[in[i]] = i;
    }
    int n = len;
    postIndex = n-1;
    stack<int> st;
    findPre(0, n-1, post, umap, st);
    while(!st.empty()) {
        cout<<st.top()<<" ";
        st.pop();
    }
    return 0;
}
