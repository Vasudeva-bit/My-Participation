#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n;
    cin>>n;
    vector<int> vectr(n);
    for(auto &i: vectr)
        cin>>i;
    for(int liars=0;liars<=n;liars++) {
        int actual = 0;
        for(auto x: vectr) {
            if(x > liars)
                actual++;
        }
        if(actual == liars) {
            cout<<liars<<endl;
            return;
        }
    }
    cout<<-1<<endl;
    return;
}

int main() {
    int T;
    cin>>T;
    while(T--) 
        solve();
}