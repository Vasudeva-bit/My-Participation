#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    vector<int> arr;
    int n;
    while(cin>>n) {
        arr.push_back(n);
    }
    if(arr.size() == 0) {
        cout<<-1;
        return 0;
    }
    n = arr[arr.size()-1];
    arr.pop_back();
    if(binary_search(arr.begin(), arr.end(), n))
        cout<<find(arr.begin(), arr.end(), n) - arr.begin();
    else
        cout<<-1;
    return 0;
}
