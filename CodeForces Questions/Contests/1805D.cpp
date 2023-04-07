#include <bits/stdc++.h>
using namespace std;


void solve(int node, vector<int>& dist, int n, vector<vector<int>> adjMat) {
    vector<bool> seen(n+1, false);
    seen[node] = true;
    queue<int> q;
    q.push(node);
    int diameter = 0;
    dist[node] = 0;
    while(!q.empty()) {
        int size = q.size();
        diameter++;
        for(int i=0;i<size;i++) {
            int node = q.front();
            q.pop();
            for(int adj: adjMat[node]) {
                if(!seen[adj]) {
                    q.push(adj);
                    seen[adj] = true;
                    dist[adj] = diameter;
                }
            }
        }
    }
}

int main() {
    int n;
    cin>>n;
    // building adjacency matrix
    vector<vector<int>> adjMat(n+1);
    for(int i=1;i<n;i++) {
        int u, v;
        cin>>u;
        cin>>v;
        adjMat[u].push_back(v);
        adjMat[v].push_back(u);
    }
    // finding one of the end nodes of diameter
    queue<int> q;
    q.push(1);
    int lnode = 1;
    vector<bool> seen(n+1, false);
    seen[1] = true;
    while(!q.empty()) {
        int size = q.size();
        for(int i=0;i<size;i++) {
            int node = q.front();
            q.pop();
            for(int adj: adjMat[node]) {
                if(!seen[adj]) {
                    q.push(adj);
                    lnode = adj;
                    seen[adj] = true;
                }
            }
        }
    }
    // cout<<lnode<<" lnode";
    // finding first node and the max diameter
    int snode = lnode;
    q.push(lnode);
    int diameter = 0;
    seen.assign(n+1, false);
    seen[lnode] = true;
    while(!q.empty()) {
        int size = q.size();
        diameter++;
        for(int i=0;i<size;i++) {
            int node = q.front();
            q.pop();
            for(int adj: adjMat[node]) {
                if(!seen[adj]) {
                    q.push(adj);
                    snode = adj;
                    seen[adj] = true;
                }
            }
        }
    }
    vector<int> sdist(n+1), ndist(n+1);
    solve(snode, sdist, n, adjMat);
    solve(lnode, ndist, n, adjMat);
    vector<int> dist;
    for(int i=1;i<=n;i++) {
        dist.push_back(max(sdist[i], ndist[i]));
    }
    sort(dist.begin(), dist.end());
    for(int k=1;k<=n;k++) {
        int node = lower_bound(dist.begin(), dist.end(), k)-dist.begin();
        if(node < n) 
            cout<<node+1<<" ";
        else
            cout<<node<<" ";
    }
    cout<<endl;
}