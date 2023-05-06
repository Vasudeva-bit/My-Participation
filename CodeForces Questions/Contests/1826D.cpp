#include <bits/stdc++.h>
using namespace std;
#define int long long

signed main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin>>T;
    vector<int> vectr;
    while(T--) {
        int n;
        cin>>n;
        vectr = vector<int>(n);
        for(int i=0;i<n;i++) {
            cin>>vectr[i];
        }
        vector<vector<int>> dp(n+1, vector<int>(3, -1));
        for(int i=0;i<n;i++) {
            dp[i+1][0] = max(dp[i][0], vectr[i]+i);
            dp[i+1][1] = max(dp[i][1], dp[i][0]+vectr[i]);
            dp[i+1][2] = max(dp[i][2], dp[i][1]+vectr[i]-i);
        }
        cout<<dp[n][2]<<endl;
    }
    return 0;
}