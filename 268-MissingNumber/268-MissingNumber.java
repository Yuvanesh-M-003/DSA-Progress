// Last updated: 7/29/2026, 6:02:04 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n*(n+1)/2);
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
           sum+=nums[i];
        } 
        return total-sum;
        // int i=0;
        // while(i<nums.length)
        // {
        //     int ind = nums[i];
        //     if(nums[i] != nums.length && nums[i] != nums[ind])
        //     {
        //       int temp = nums[i];
        //       nums[i] = nums[ind];
        //       nums[ind] = temp;
        //     }
        //     else{i++;}
        // }
        // for(i=0;i<nums.length;i++)
        // {
        //     if(nums[i]!=i)
        //     {
        //         return i;
        //     }
        // }
        // return nums.length;
    }
}