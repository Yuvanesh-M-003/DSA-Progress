// Last updated: 7/29/2026, 6:05:11 PM
class Solution {
    public int search(int[] nums, int target) {
        int max = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                max = i;
            }
        }
        return max;
    }
}