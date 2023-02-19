#include <bits/stdc++.h>;
using namespace std;
class Solution {
    public:
    vector<vector<int>> dp;
    int recursion(int exor, int k, int n, vector<int>& arr) {
        if(n == arr.size() and exor == k)
            return dp[n][exor] = 1;
        else if(n == arr.size())
            return dp[n][exor] = 0;
        if(dp[n][exor] != -1)
            return dp[n][exor];
        int ans = 0;
        ans += recursion(exor^arr[n], k, n+1, arr);
        ans += recursion(exor, k, n+1, arr);
        return dp[n][exor] = ans;
    }
    int peak(vector<int>& arr) {
        int out = INT_MIN;
        for(auto val: arr) {
            out = max(out, val);
        }
        return out;
    }
    int subsetXOR(vector<int> arr, int N, int K) {
        int M = pow(2, (int)log2(peak(arr))+1)-1;
        dp = vector<vector<int>>(N+1, vector<int>(M+1, -1));
        return recursion(0, K, 0, arr);
    }
};