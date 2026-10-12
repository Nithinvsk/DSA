class Solution {
    public int count(int coins[], int sum) {
        int n = coins.length;
        int dp [][] = new int[n+1][sum+1];
        for(int i=0;i<n+1;i++) {
            dp[i][0] = 1;
        }
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=sum;j++) {
                int ithcoin = coins[i-1];
                int exc = dp[i-1][j];
                int inc = 0;
                if(ithcoin <= j) {
                    inc = dp[i][j-ithcoin];
                }
                dp[i][j] = inc + exc;
            }
        }
        return dp[n][sum];
    }
}