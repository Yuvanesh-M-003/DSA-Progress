// Last updated: 7/29/2026, 6:02:24 PM
class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
        if(n==1||n==2) 
        {
            return true;
        }
        if(n<=0||n%2!=0) 
        {
            return false;
        }
        return isPowerOfTwo(n/2);

    }
}