// Last updated: 7/29/2026, 5:59:23 PM
class Solution 
{
    public int minimumRecolors(String blocks, int k) 
    {
        int m = k,count =0,n = blocks.length();
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W')
            {
                count++;
            }
        }
        int min= count ;
        for(int i=1;i<n-k+1;i++)
        {
            if(blocks.charAt(i-1)=='W')
            {
                count--;
            }
            if(blocks.charAt(i+k-1)=='W')
            {
                count++;
            }
            if(count < min)
            {
                min = count;
            }
        }
        return min;
    }
}