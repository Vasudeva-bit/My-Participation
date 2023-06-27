#include <bits/stdc++.h>
using namespace std;
int N = 1e6+100;
vector<int> min_div(N);

void solve() {
    int n, m;
    cin>>n>>m;
    cout<<(n == 1 or min_div[n] > m ? "YES":"NO")<<endl;
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    for(int d=2;d*d<N;d++) {
        if(min_div[d] == 0) {
            min_div[d] = d;
            for(int i=d*d;i<N;i=i+=d) {
                if(min_div[i] == 0) {
                    min_div[i] = d;
                }
            }
        }
    }
    for(int i=1;i<N;i++) 
        if(min_div[i] == 0)
            min_div[i] = i;
    int T;
    cin>>T;
    while(T--)
        solve();
    return 0;
}