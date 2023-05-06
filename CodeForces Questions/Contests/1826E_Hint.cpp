#include <bits/stdc++.h>
using namespace std;

const int N = 5005;
using bs = bitset<N>;

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int n, m;
    cin >> m >> n;
    vector<vector<int>> a(n, vector<int>(m + 1));
    for (int i = 0; i < n; i++)
        cin >> a[i][m];
    for (int j = 0; j < m; j++)
    {
        for (int i = 0; i < n; i++)
            cin >> a[i][j];
    }
    sort(a.begin(), a.end()); // sorts row wise
    vector<bs> lower(n);
    for (int i = 0; i < n; i++)
        lower[i].set();
    vector<int> inds(n);
    iota(inds.begin(), inds.end(), 0);
    for (int i = 0; i < m; i++)
    {
        sort(inds.begin(), inds.end(), [&](int x, int y)
             { return a[x][i] < a[y][i]; });
        bs cur = 0;
        int p = 0;
        for (int j = 0; j < n; j++)
        {
            while (a[inds[p]][i] < a[inds[j]][i])
                cur.set(inds[p++], 1);
            lower[inds[j]] &= cur;
        }
    }

    vector<long long> dp(n);
    for (int i = 0; i < n; i++)
    {
        dp[i] = a[i][m];
        for (int j = 0; j < i; j++)
        {
            if (lower[i][j])
                dp[i] = max(dp[i], dp[j] + a[i][m]);
        }
    }
    cout << *max_element(dp.begin(), dp.end()) << '\n';
}
