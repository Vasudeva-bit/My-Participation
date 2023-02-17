#include <bits/stdc++.h>
using namespace std;
int main() {
    int T;
    cin>>T;
    for(int t=1;t<=T;t++) {
        int n;
        cin>>n;
        vector<int> bits;
        bool flag = false;
        bool conFlip = false;
        for(int i=0;i<n;i++) {
            int val;
            cin>>val;
            if(!conFlip and val == -1)
                flag = true;
            if(!conFlip and val == -1 and bits.size() > 0 and bits.back() == -1) {
                conFlip = true;
                flag = false;
            }
            bits.push_back(val);
        }
        int sum = 0;
        for(auto val: bits) {
            sum += val;
        }
        if(conFlip) {
            sum += 4;
        }
        else if(!flag) {
            sum -= 4;
        }
        cout<<sum<<endl;
    }
}