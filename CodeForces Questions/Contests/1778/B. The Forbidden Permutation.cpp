#include <bits/stdc++.h>
using namespace std;
int main() {
    int T;
    cin>>T;
    for(int t=1;t<=T;t++) {
        int n, m, d;
        cin>>n;
        cin>>m;
        cin>>d;
        unordered_map<int, int> pos;
        vector<int> a;
        for(int i=0;i<n;i++) {
            int val;
            cin>>val;
            pos[val] = i;
        }
        for(int i=0;i<m;i++) {
            int val;
            cin>>val;
            a.push_back(val);
        }
        int out = INT_MAX;
        for(int i=0;i<m-1;i++) {
            if(pos[a[i]] >= pos[a[i+1]] or pos[a[i+1]]-pos[a[i]] > d) {
                out = 0;
                break;
            }
            int dist = pos[a[i+1]] - pos[a[i]];
            out = min(out, dist);
            int swaps = d-dist+1;
            int possibleSwaps = (pos[a[i]]-1) + (n-pos[a[i+1]]);
            if(possibleSwaps >= swaps)
                out = min(out, swaps);
        }
        cout<<out<<endl;
    }
}