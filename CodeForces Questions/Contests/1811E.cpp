#include <bits/stdc++.h>
using namespace std;
#define int long long

int dp[19][2];

int dfs(int idx, string &lim, bool tight) {
    int out = 0;
    if(idx == lim.size()) return 1;
    if(dp[idx][tight] != -1) return dp[idx][tight];
    for(int i=0;i<=(tight)?lim[idx]-'0':9;i++) {
        if(i == 4) continue;
        out += dfs(idx+1, lim, (tight)?(i==lim[idx]-'0'):0);
    }
    return dp[idx][tight] = out;
}

bool solve() {
    int n;
    cin>>n;
    int l = 0;
    int r = 1e15;
    int out = r;
    while(l <= r) {
        int mid = (l+r)>>1;
        string lim = to_string(mid);
        memset(dp, -1, sizeof dp);
        int count = dfs(0, lim, 1)-1;
        cout<<count<<"yes"<<endl;
        if(count >= n) {
            out = mid;
            r = mid-1;
        }
        else
            l = mid+1;
    }
    cout<<out<<endl;
}
int32_t main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin>>T;
    while(T--) {
        solve();
    }
    return 0;
}