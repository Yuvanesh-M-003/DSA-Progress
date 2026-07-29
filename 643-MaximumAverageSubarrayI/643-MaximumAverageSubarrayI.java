// Last updated: 7/29/2026, 6:01:13 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
		for(int  i=0; i<k; i++)
		{
			sum=sum+nums[i];
		}
        int max = sum;
		for(int i=1; i<nums.length-k+1; i++)
		{
			sum=sum-nums[i-1]+nums[i+k-1];
                if(max<sum)
                {
                    max=sum;
                }
                //return max;
            	}
        return (double)max/k;
    }
}