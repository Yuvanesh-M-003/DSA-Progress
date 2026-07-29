// Last updated: 7/29/2026, 5:59:59 PM
class Solution 
{
    public int maxScore(int[] cardPoints, int k) 
    {
        int sum =0 ;
        for(int i=0 ;i<k;i++)
        {
            sum += cardPoints[i];
        }
        int max = sum;
        for(int i=0;i<k;i++)
        {
            sum += cardPoints[cardPoints.length-i-1]-cardPoints[k-i-1];
            if(sum>max)
            {
                max = sum;
            }
        }
        return max;
    }
}