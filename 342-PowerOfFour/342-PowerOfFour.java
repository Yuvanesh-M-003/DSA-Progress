// Last updated: 7/29/2026, 6:01:50 PM
class Solution {
    public boolean isPowerOfFour(int n) {
         if(n==1||n==4) 
        {
            return true;
        }
        if(n<=0||n%4!=0) 
        {
            return false;
        }
        return isPowerOfFour(n/4);
    }
}