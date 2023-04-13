#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin>>T;
    while(T--) {
        int n;
        cin>>n;
        vector<int> preSum(n+1), vectr(n+1);
        for(int i=1;i<=n;i++) {
            cin>>vectr[i];
            preSum[i] = preSum[i-1] + vectr[i];
        }
        int l = 1;
        int out = 1;
        int r = n;
        while(l <= r) {
            int mid = (l+r)/2;
            cout<<"?"<<" ";
            cout<<mid-l+1<<" ";
            for(int i=l;i<=mid;i++) {
                cout<<i<<" ";
            }
            cout<<endl;
            int exp;
            cin>>exp;
            int sum = preSum[mid]-preSum[l-1];
            if(exp > sum ){
                out = mid;
                r = mid-1;
            }
            else
                l = mid+1;
        }
        cout<<"!"<<" "<<out<<endl;
    }
}