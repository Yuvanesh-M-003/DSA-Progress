// Last updated: 7/29/2026, 5:59:53 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int [] count = new int [nums.length];
        int sum= 0;
        for(int i =0;i<nums.length;i++)
        {
           sum += nums[i];
           count[i] = sum;
        }
       return count;
    }
}