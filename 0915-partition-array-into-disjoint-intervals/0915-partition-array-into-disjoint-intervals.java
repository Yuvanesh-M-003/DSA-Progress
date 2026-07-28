class Solution {
    public int partitionDisjoint(int[] nums) {
        int lMax = nums[0];
        int max = nums[0];
        int ans = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            
            if (nums[i] < lMax) {
                lMax = max;
                ans = i;
            }
        }
        
        return ans + 1;
    }
}
