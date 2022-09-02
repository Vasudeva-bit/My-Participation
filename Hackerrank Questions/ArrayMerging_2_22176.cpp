#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    int idx = 0;
    vector<int> idxs;
    for(int i=0;i<n;i++) {
        int m;
        cin>>m;
        if(m % 2 == 0)
            idxs.push_back(idx);
        cout<<m<<" ";
        idx++;
    }
    cin>>n;
    for(int i=0;i<n;i++) {
        int m;
        cin>>m;
        if(m % 2 == 0)
            idxs.push_back(idx);
        cout<<m<<" ";
        idx++;
    }
    cout<<endl;
    if(idxs.size() == 0) {
        cout<<-1;
        return 0;
    }
    for(auto i:idxs) {
        cout<<i<<" ";
    }
    return 0;
}
