// Last updated: 7/29/2026, 6:03:09 PM
class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            min = Math.min(min,nums[i]);
        }
        return min;
    }
}