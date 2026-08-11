class Solution {
    public int longestPalindromeSubseq(String s) {
   StringBuilder sb = new StringBuilder(s);
   int [][]dp = new int [s.length()][s.length()];
   for(int i[] : dp)
   {
        Arrays.fill(i,-1);
   }
    return longsub(s.length()-1 , s.length()-1 , s , sb.reverse().toString() , dp);
    }
    public int longsub(int i , int j , String s1 , String s2 , int [][]dp)
    {
        if(i <0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = 1 + longsub(i-1 , j-1 , s1 , s2 , dp);
        else
        {
            int l = longsub(i , j-1 , s1 , s2 , dp);
            int r = longsub(i-1 , j , s1 , s2 , dp);
            return dp[i][j] = Math.max(l ,r);
        }
    }
}