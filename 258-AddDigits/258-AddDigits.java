// Last updated: 7/29/2026, 6:02:10 PM
class Solution
 {
    public int addDigits(int num) 
    {
        int x=0;
        if(num==0)
        {
            return 0;
        }
         return  1+(num-1)%9;
    }
}