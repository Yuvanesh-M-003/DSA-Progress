// Last updated: 7/29/2026, 6:04:50 PM
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;

        for(int i=0; i<nums.length; i++) {
            if(i > max) return false;
            max = Math.max(max, i + nums[i]);
        }

        return true;
    }
} 