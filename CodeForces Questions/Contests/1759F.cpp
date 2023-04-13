#include <bits/stdc++.h>
#define int long long
using namespace std;
void solve() {
    int n, p;
    int out = 0;
    cin>>n>>p;
    vector<int> vectr(n);
    map<int, bool> seen;
    for(int i=0;i<n;i++) {
        cin>>vectr[i];
        seen[vectr[i]] = true;
    }
    int left = vectr[n-1];
    while(seen[left-1])
        left--;
    int missing = p-1;
    while(seen[missing] and missing > vectr[n-1]) 
        missing--;
    if(left == 0) {
        out = missing - vectr[n-1];
    }
    else {
        out = p - vectr[n-1];
        vectr[n-1] = 0;
        int carry = 1;
        for(int i=n-2;i>=0 and carry;--i) {
            if(vectr[i] == p-1)
                vectr[i] = 0;
            else {
                vectr[i]++;
                carry = 0;
            }
        }
        for(int i=0;i<n;i++)
            seen[vectr[i]] = true;
        if(carry)
            seen[1] = true;
        while(seen[left-1])
            left--;
        if(left)
            out += left-1;
    }
    cout<<out<<endl;
}
signed main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin>>T;
    while(T--) {
        solve();
    }
}