#include <bits/stdc++.h>
using namespace std;
#define vi vector<int>
#define vb vector<bool>
vb seen;
int main() {
    int n;
    cin>>n;
    vi vectr;
    for(int i=0;i<n;i++) {
        int val;
        cin>>val;
        vectr.push_back(val-1);
    }
    int flag = false;
    for(int i=0;i<n;i++) {
        if(vectr[vectr[vectr[i]]] == i)
            flag = true;
    }
    if(flag) cout<<"YES";
    else cout<<"NO";
    return 0;
}