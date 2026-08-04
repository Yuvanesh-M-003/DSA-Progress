// Last updated: 8/4/2026, 9:12:57 AM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        int st = nums[0] , end = nums[nums.length -1];
        for(int i : nums)
        {
          list.add(i);
        }
        for(int i = st; i<= end; i++)
        {
          if(!list.contains(i))
          {
            l.add(i);
          }
        }
        return l;
    }
}