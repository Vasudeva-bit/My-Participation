#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n = 10;
    vector<int> arr;
    for(int i=0;i<n;i++) {
        int tmp;
        cin>>tmp;
        arr.push_back(tmp);
    }
    for(int i=0;i<n;i++) {
        for(int j=0;j<n-i-1;j++) {
            if(arr[j] > arr[j+1])
                swap(arr[j], arr[j+1]);
        }
    }
    for(int i=0;i<n;i++) {
        cout<<arr[i]<<" ";
    }
    return 0;
}
