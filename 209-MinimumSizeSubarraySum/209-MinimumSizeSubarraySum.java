// Last updated: 7/29/2026, 6:02:35 PM
class Solution 
{
    public int minSubArrayLen(int target, int[] nums) 
    {
        int sum = 0, si =0, min = nums.length;
        if(nums[si] >= target)
              {
                min = 1;
              }
                sum = nums[si]; 
        for(int li=1;li<nums.length;li++)
        {
                sum += nums[li];
              while(sum>=target)
              {
                if((li-si+1) < min)
                {
                    min = li-si+1; 
                }
                sum -= nums[si];
                si++;
              }
        }
        if(si == 0&& sum< target)
        {
            return 0;
        }
        return min;
    }
}