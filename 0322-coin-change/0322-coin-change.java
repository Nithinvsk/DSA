class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n+1][amount+1];
        for(int j=0;j<amount+1;j++) {
            dp[0][j] = Integer.MAX_VALUE;
        }
        for(int i=1;i<n+1;i++) {
            for(int j=1;j<amount+1;j++) {
                int ithcoin = coins[i-1];
                int exc = dp[i-1][j];
                int inc = 0;
                if(ithcoin <= j) {
                    inc = dp[i][j-ithcoin];
                    if(inc != Integer.MAX_VALUE) {
                        inc = 1+inc;
                    }
                    dp[i][j] = Math.min(inc,exc);
                }
                else {
                    dp[i][j] = exc;
                }
            }
        }
        if(dp[n][amount] == Integer.MAX_VALUE) {
            return -1;
        }
        return dp[n][amount];
    }
}