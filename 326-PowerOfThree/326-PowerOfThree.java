// Last updated: 7/29/2026, 6:01:55 PM
class Solution 
{
    public boolean isPowerOfThree(int n) 
    {
      if(n==1||n==3) 
        {
            return true;
        }
        if(n<=0||n%3!=0) 
        {
            return false;
        }
        return isPowerOfThree(n/3);   
    }
}
