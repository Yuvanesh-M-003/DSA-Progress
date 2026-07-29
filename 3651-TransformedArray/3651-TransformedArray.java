// Last updated: 7/29/2026, 5:59:04 PM
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++)
            res[i] = nums[(((i + nums[i]) % n) + n) % n];

        return res;
    }
}
