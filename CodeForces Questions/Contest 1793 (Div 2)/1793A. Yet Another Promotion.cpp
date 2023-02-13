#include <bits/stdc++.h>
using namespace std;

int main() {
    int T;
    cin>>T;
    for(int t=1;t<=T;t++) {
        int p1, p2, n, m;
        cin>>p1;
        cin>>p2;
        cin>>n;
        cin>>m;
        int out;
        if(p1 <= p2) {
            if(n == m+1)
                out = m*p1;
            else
                out = n*p1;
        }
        else {
            if(m*(int(n/m))*(p1-p2) <= ((m*(int(n/m)))+int(n/m))*p2) {
                out = int(n/m)*p1;
                out += ((n%m)-(int(n/m)))*p2;
            }
            else
                out = n*p2;
        }
        cout<<out<<endl;
    }
}