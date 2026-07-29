// Last updated: 7/29/2026, 6:02:01 PM
class Solution {
    public int findDuplicate(int[] nums) {
         Set<Integer> s = new HashSet<>();
         int l=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!s.contains(nums[i]))
            {
                s.add(nums[i]);
            }
            else
            {
                l =nums[i];
            }
        }
        return l;
    }
}