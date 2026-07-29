// Last updated: 7/29/2026, 6:01:07 PM
class Solution {

    public boolean canPartitionKSubsets(int[] nums, int k) {

        int sum = 0;
        for(int num : nums) sum += num;

        if(sum % k != 0) return false;

        int target = sum / k;

        boolean[] used = new boolean[nums.length];

        return backtrack(nums, used, k, 0, 0, target);
    }

    private boolean backtrack(int[] nums, boolean[] used,
                              int k, int start,
                              int currentSum, int target) {

        if(k == 0) return true;

        if(currentSum == target) {
            return backtrack(nums, used, k - 1, 0, 0, target);
        }

        for(int i = start; i < nums.length; i++) {

            if(used[i]) continue;

            if(currentSum + nums[i] > target) continue;

            used[i] = true;

            if(backtrack(nums, used, k, i + 1,
                         currentSum + nums[i], target))
                return true;

            used[i] = false;
        }

        return false;
    }
}