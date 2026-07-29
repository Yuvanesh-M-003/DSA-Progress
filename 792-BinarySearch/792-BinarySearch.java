// Last updated: 7/29/2026, 6:00:55 PM
class Solution {
    public int search(int[] nums, int target) {
        int si=0,li = nums.length;
        while(li>si)
        {
            int mid = (si+li)/2;
            if(nums[mid]== target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                li--;
            }
            else
            {
                si++;
            }
        }
        return -1;
    }
}