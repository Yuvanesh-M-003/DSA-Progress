// Last updated: 7/29/2026, 5:59:55 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int j = 0;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                sum++;
            }

            while (i - j + 1 > sum + 1) {
                sum -= nums[j];
                j++;
            }

            maxSum = Math.max(maxSum, sum);
        }

        if(sum == n)
        {
            return n-1;
        }
        return maxSum;
    }
}