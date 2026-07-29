// Last updated: 7/29/2026, 6:05:18 PM
class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
       int count = 0;
       for(int i=0; i<nums.length; i++)
       {
        if(nums[i] != val)
        {
            nums[count] = nums[i];
            count++;
        }
       }
       return count ;
    }
}