// Last updated: 7/29/2026, 6:05:05 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == count)count ++;
            else if(nums[i] > count) return count;
        }
        return count;
       }
}