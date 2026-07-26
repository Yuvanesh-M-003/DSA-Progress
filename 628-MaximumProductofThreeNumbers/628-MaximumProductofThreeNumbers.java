// Last updated: 7/26/2026, 10:06:53 PM
1import java.util.Arrays;
2
3class Solution {
4    public int maximumProduct(int[] nums) {
5        int n = nums.length;
6        
7        Arrays.sort(nums);
8        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
9        int product2 = nums[0] * nums[1] * nums[n - 1];
10        return Math.max(product1, product2);
11    }
12}
13