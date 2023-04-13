#include <bits/stdc++.h>
using namespace std;
int divide_up(int a, int b) {
    if(b<0) {
        a = -a;
        b = -b;
    }
    if(a < 0) {
        return a/b;
    }
    else {
        return (a+b-1)/b;
    }
    // return ceil((a*(1.0))/b); c++ in-built ceil method can also be used
}
int gcd(int n, int m, int &a, int &b) {
    if(n == 0) {
        a = 0;
        b = 1;
        return m;
    }
    int a_ = 0, b_ = 0;
    int d = gcd(m%n, n, a_, b_);
    a = b_ - a_*(m/n);
    b = a_;
    return d;
}
pair<int, int> solve(int n, int m, int x1, int y1, int x2, int y2) {
    int a = 0, b = 0;
    int d = gcd(n, m, a, b);
    int c = x1 - y1 - x2 + y2;
    if(c%d) {
        return {INT_MAX, INT_MAX};
    }
    a *= c/d;
    b *= c/d;
    b = -b;
    int n_ = n/d;
    int m_ = m/d;
    int k = divide_up(divide_up(x1-x2, n)-a, m_);
    a += m_*k;
    b += n_*k;
    return {x2 + a*n, y2+b*m};
}
int32_t main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin>>T;
    while(T--) {
        int n, m, x1, x2, y1, y2;
        cin>>n>>m>>x1>>y1>>x2>>y2;
        n--;m--;x1--;y1--;x2--;y2--;
        string s;
        cin>>s;
        if(x1 == x2 and y1 == y2) {
            cout<<"0\n";
            continue;
        }
        if(s[0] != 'D') {
            x1 = n-x1;
            x2 = n-x2;
        }
        if(s[1] != 'R') {
            y1 = m-y1;
            y2 = m-y2;
        }
        pair<int, int> closest = {INT_MAX, INT_MAX};
        for(int i=0;i<2;i++,x2=2*n-x2) {
            for(int j=0;j<2;j++,y2=2*m-y2) {
                closest = min(closest, solve(n*2, m*2, x1, y1, x2, y2));
            }
        }
        if(closest.first == INT_MAX) {
            cout<<-1<<'\n';
            continue;
        }
        int ans = (closest.first-1)/n + (closest.second-1)/m;
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                int sx = x1, sy = y1;
                if(i != 1 || j != 1) {sx++; sy++;}
                pair<int, int> closest_angle = solve(n*2, m*2, sx, sy, i*n, j*m);
                if(closest_angle.first < closest.first)
                    ans--;
            }
        }
        cout<<ans<<"\n";
    }
}