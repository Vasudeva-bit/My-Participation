#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n;
    cin>>n;
    vector<int> vectr(n);
    for(auto &i: vectr) 
        cin>>i;
    int out = 0;
    for(int i=0;i<n;i++) {
        out = __gcd(out, abs(vectr[i]-vectr[n-i-1]));
    }
    cout<<out<<endl;
}

int main() {
    cin.tie(0);
    cout.tie(0);
    ios_base::sync_with_stdio(0);
    int T;
    cin>>T;
    while(T--) {
        solve();
    }
}