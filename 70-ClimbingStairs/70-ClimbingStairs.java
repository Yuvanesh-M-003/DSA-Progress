// Last updated: 7/29/2026, 6:04:32 PM
class Solution {
  public int climbStairs(int n) {
    int prev1 = 1; 
    int prev2 = 1; 
    for (int i = 2; i <= n; ++i) {
     int dp = prev1 + prev2;
      prev2 = prev1;
      prev1 = dp;
    }
    return prev1;
  }
}