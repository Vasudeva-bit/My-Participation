#include <bits/stdc++.h>
using namespace std;
#define fastio std::ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);

#define ll long long
string unmatch;
bool mark[26];
string a, b;
ll out, k, n;
ll computer() {
    ll computed = 0;
    ll count = 0;
    for(int i=0;i<n;i++) {
        if(a[i] == b[i] or mark[a[i]-'a'])
            count++;
        else {
            computed += (count*(count+1))/2;
            count = 0;
        }
    }
    computed += (count*(count+1))/2;
    return computed;
}
void solve(int pos, int cnt) {
    if(cnt > k)
        return;
    if(pos == unmatch.size()) {
        ll computed = computer();
        if(cnt == k) out = (out > computed)?out:computed;
        return;
    }
    solve(pos+1, cnt);
    mark[unmatch[pos]-'a'] = 1;
    solve(pos+1, cnt+1);
    mark[unmatch[pos]-'a'] = 0;
}
int main() {
    fastio;
    ll T;
    cin>>T;
    for(int t=1;t<=T;t++) {
        cin>>n;
        cin>>k;
        cin>>a;
        cin>>b;
        unordered_set<char> ust;
        for(auto ch: a) {ust.insert(ch);}
        unmatch.clear();
        memset(mark, 0, sizeof mark);
        for(auto ch: ust) {unmatch.push_back(ch);}
        k = (k > unmatch.size())?unmatch.size():k;
        out = 0;
        solve(0, 0);
        cout<<out<<endl;
    }
}