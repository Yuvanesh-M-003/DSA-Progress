class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int globalResult = nums[0];
        int dp = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            dp = (dp >= 0) ? dp + nums[i] : nums[i];
            globalResult = Math.max(globalResult, dp);
        }
        
        return globalResult;
    }
}