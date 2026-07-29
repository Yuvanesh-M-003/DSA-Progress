// Last updated: 7/29/2026, 6:01:57 PM
class Solution {
    public int coinChange(int[] coins, int amount) {
       int dp[] = new int [amount+1];
       for(int i=1 ; i<amount+1 ; i++)
       {
        dp[i] = amount +1;
        for(int c: coins)
        {
            if(c <= i){
                dp[i] = Math.min(dp[i] , dp[i-c]+1);
            }
        }
       }
       if(dp[amount] == amount+1) return -1;
       return dp[amount];
    }
}