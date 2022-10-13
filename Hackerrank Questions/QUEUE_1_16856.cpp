#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <queue>
using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    int sin;
    cin>>sin;
    vector<int> vec(n);
    for(int i=0;i<n;i++) {
        int tmp;
        cin>>tmp;
        vec[i] = tmp;
    }
    long long out = 1;
    for(int i=0;i<n;i++) {
        int f = 1;
        // cout<<vec[i];
        for(int j=i+1;j<n;j++) {
            if(vec[i] > vec[j]) {
                f = j - i + 1;
                break;
            }
        }
        out = (out*f)%1000000007;
    }
    cout<<int(out%1000000007);
    return 0;
}
