// Last updated: 7/29/2026, 6:03:00 PM
class Solution {
    public int majorityElement(int[] nums) {
       
        int num=0,count =0;
        for(int i=0;i<nums.length;i++)
        {
            if(count == 0)
            {
                num = nums[i];
            }
            if(num == nums[i]) count ++;
            else count--;
        }
        return num;
    }
}