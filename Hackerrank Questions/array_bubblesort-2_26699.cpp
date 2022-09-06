#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    vector<int> vec;
    while(cin>>n) {
        vec.push_back(n);
    }
    sort(vec.begin(), vec.end(), greater<int>());
    for(auto it:vec) {
        cout<<it<<" ";
    }
    return 0;
}
