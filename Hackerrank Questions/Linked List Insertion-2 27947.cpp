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
    if(!(n > 5 and n < 10)) {
        cout<<"Invalid Input";
        return 0;
    }
    vector<int> vec;
    for(int i=0;i<n;i++) {
        int val;
        cin>>val;
        vec.push_back(val);
    }
    for(int i=0;i<n-1;i++) {
        if(vec[i] == vec[i+1]) {
            int tmp;
            if(i-1 < 0 and i+2 < n){
                tmp = vec[i+2];
            }
            else if(i+2 >= n) {
                tmp = vec[i-1];
            }
            else {
                tmp = vec[i-1] + vec[i+2];
            }
            vec.insert(vec.begin()+i+1, tmp);
            n++;
        }
    }
    for(auto i:vec) {
        cout<<i<<" ";
    }
    return 0;
}
