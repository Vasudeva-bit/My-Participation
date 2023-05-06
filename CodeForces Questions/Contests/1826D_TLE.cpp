#include <bits/stdc++.h>
using namespace std;
#define int long long

vector<int> vectr;

int recur(int cost, int count, bool flag, int idx) {
    if(count == 0 or idx == vectr.size())
        return cost;
    if(flag)
        cost--;
    return max(recur(cost+vectr[idx], count-1, true, idx+1), recur(cost, count, flag, idx+1));
}

void solve() {
    int n;
    cin>>n;
    vectr = vector<int>(n);
    for(int i=0;i<n;i++)
        cin>>vectr[i];
    cout<<recur(0, 3, false, 0)<<endl;
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