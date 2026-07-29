// Last updated: 7/29/2026, 5:59:37 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int[(nums.length)*2];
        for(int i =0 ;i<nums.length ; i++)
        {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}