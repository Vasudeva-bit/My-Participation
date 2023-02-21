class Solution {
    public:
	int perfectSum(int arr[], int n, int sum)
	{
        int dp[n+1][sum+1];
        for(int j=0;j<=sum;j++) {
            dp[0][j] = 0;
        }
	    for(int i=0;i<=n;i++) {
	        dp[i][0] = 1;
	    }
	    for(int i=1;i<=n;i++) {
	        for(int j=0;j<=sum;j++) {
	            if(arr[i-1] <= j) 
	                dp[i][j] = (dp[i-1][j] + dp[i-1][j-arr[i-1]])%(int)(1e9+7);
	            else
	                dp[i][j] = dp[i-1][j]%(int)(1e9+7);
	        }
	    }
	    return dp[n][sum]%(int)(1e9+7);
	}
};