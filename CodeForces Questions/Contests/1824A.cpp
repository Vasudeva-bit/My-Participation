#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n, m;
    cin>>n>>m;
    vector<bool> seat(m+1, false);
    int countL = 0, countR = 0;
    int x;
    int filled = 0;
    for(int i=0;i<n;i++) {
        cin>>x;
        if(x > 0) seat[x] = true;
        else if(x == -1) countL++;
        else if(x == -2) countR++;
    }
    int L = 0, R = 0;
    for(int i=1;i<=m;i++) {
        if(seat[i]) filled++;
        else R++;
    }
    int out = filled + max(countL, countR);
    for(int i=1;i<=m;i++) {
        if(seat[i]) 
            out = max(out, min(countL, L) + min(countR, R) + filled);
        else L++, R--;
    }
    out = min(out, m);
    cout<<out<<endl;
}

int main() {
    int T;
    cin>>T;
    while(T--) {
        solve();
    }
}