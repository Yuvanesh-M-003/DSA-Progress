// Last updated: 7/29/2026, 6:01:42 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<>();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!s.contains(nums[i]))
            {
                s.add(nums[i]);
            }
            else
            {
                l.add(nums[i]);
            }
        }
        return l;
    }
}