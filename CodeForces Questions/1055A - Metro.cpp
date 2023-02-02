#include <bits/stdc++.h>
using namespace std;
#define vi vector<int>
#define vvi vector<vector<int>>
vector<bool> seen;
bool DFS(int src, int des, vvi& adjMat) {
    if(src == des) return true;
    if(seen[src])
        return false;
    seen[src] = true;
    bool flag = false;
    for(auto adj: adjMat[src]) {
        flag = flag or DFS(adj, des, adjMat);
    }
    return flag;
}
int main() {
    int n, s;
    seen = vector<bool>(n+1, false);
    cin>>n>>s;
    s;
    vvi adjMat(n+1, vi());
    vi vect;
    for(int i=1;i<=n;i++) {
        int val;
        cin>>val;
        if(val == 1)
            vect.push_back(i);
    }
    for(int i=0;vect.size()>0 and i<(vect.size()-1);i++) {
        adjMat[vect[i]].push_back(vect[i+1]);
    }
    vi vectr;
    for(int i=1;i<=n;i++) {
        int val;
        cin>>val;
        if(val == 1)
        vectr.push_back(i);
    }
    for(int i=(vectr.size()-1);i>0;i--) {
        adjMat[vectr[i]].push_back(vectr[i-1]);
    }
    if(DFS(1, s, adjMat)) cout<<"YES";
    else cout<<"NO";
    return 0;
}