// Last updated: 7/29/2026, 6:03:04 PM
class Solution {
    public int maximumGap(int[] nums) {

        Arrays.sort(nums);

        if(nums.length == 0 || nums.length == 1) return 0;

        int diff = 0 , max = 0;

        for(int i=0; i<nums.length-1; i++)
        {
            diff = nums[i] - nums[i + 1];
            if(diff < 0) diff *= -1;

            max = Math.max(max , diff);
        }
        return max;
    }
}