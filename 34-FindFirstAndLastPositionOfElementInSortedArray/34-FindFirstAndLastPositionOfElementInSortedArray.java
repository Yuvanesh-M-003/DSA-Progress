// Last updated: 7/29/2026, 6:05:09 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = new int [2];
        int l = 0;
        if(nums.length == 0) return new int [] {-1,-1};
        for(int i =0;i<nums.length;i++)
        {
            if(l == 0){
            if(nums[i] == target)
            {
               ans [0] = i;
               l = 2;
            }}
            if(l == 2)
            {
                if(nums[i] == target)
                {
                   ans [1] = i;
                }
            }
            else
            {
                ans [0] = -1;
                ans [1] = -1;
            }
        }
        return ans;
    }
}