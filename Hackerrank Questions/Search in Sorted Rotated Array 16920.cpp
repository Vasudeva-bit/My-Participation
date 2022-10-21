#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    vector<int> vec;
    int n;
    cin>>n;
    for(int i=0;i<n;i++) {
        int tmp;
        cin>>tmp;
        vec.push_back(tmp);
    }
    int val;
    cin>>val;
    int pos;
    pos = lower_bound(vec.begin(), vec.end(), val) - vec.begin();
    if(vec[pos] != val) {
        cout<<"Not found";
        return 0;
    }
    cout<<"Found at index ";
    cout<<pos;
    return 0;
}
