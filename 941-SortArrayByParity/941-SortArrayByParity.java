// Last updated: 7/29/2026, 6:00:40 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] arr = new int[nums.length];
        int si=0,li = arr.length-1;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]%2==0)
           {
            arr[si]=nums[i];
            si++;
           }
           else
           {
            arr[li] = nums[i];
            li--;
           }
        }
        return arr;
    }
}