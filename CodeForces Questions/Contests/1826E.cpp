#include <bits/stdc++.h>
using namespace std;
#define int long long

int32_t main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int m, n;
    cin>>m>>n;
    vector<vector<int>> vectr(n, vector<int>(m+1));
    for(int i=0;i<n;i++)
        cin>>vectr[i][m];
    for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
            cin>>vectr[j][i];
    
    sort(vectr.begin(), vectr.end());
    vector<bitset<5005>> lower(n);

    for(int i=0;i<n;i++) 
        lower[i].set();

    vector<int> idx(n);
    iota(idx.begin(), idx.end(), 0);

    for(int i=0;i<m;i++) {
        sort(idx.begin(), idx.end(), [&] (int x, int y) {
            return vectr[x][i] < vectr[y][i];});
        int p=0;
        bitset<5005> cur = 0;
        for(int j=0;j<n;j++) {
            while(vectr[idx[p]][i] < vectr[idx[j]][i])
                cur.set(idx[p++], 1);
            lower[idx[j]] &= cur;
        }
    }

    vector<int> dp(n, 0);
    for(int i=0;i<n;i++) {
        dp[i] = vectr[i][m];
        for(int j=0;j<i;j++) {
            if(lower[i][j])
                dp[i] = max(dp[i], dp[j]+vectr[i][m]);
        }
    }
    cout<<*max_element(dp.begin(), dp.end())<<endl;
}