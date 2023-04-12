#include <bits/stdc++.h>
using namespace std;

int solve() {
    int n;
    cin>>n;
    vector<int> vectr(n+1), dp(n+1, 0);
    dp[0] = 1;
    int i;
    for(i=1;i<=n;i++) {
        cin>>vectr[i];
    }
    for(i=1;i<=n;i++) {
        if((i-vectr[i]-1) >= 0 and dp[i-vectr[i]-1])
            dp[i] = 1;
        if((i+vectr[i]) <= n and dp[i-1])
            dp[i+vectr[i]] = 1;
    }
    return dp[n];
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin>>T;
    while(T--) {
        if(solve())
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
}