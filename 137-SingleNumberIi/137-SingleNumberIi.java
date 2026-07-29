// Last updated: 7/29/2026, 6:03:21 PM
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer , Integer> res = new HashMap<>();
        for(int i =0; i < nums.length ; i++)
        {
            res.put(nums[i] , res.getOrDefault(nums[i] , 0 )+1);
        }
        for(Integer num : res.keySet())
        {
            if(res.get(num) == 1)
            {
                return num;
            }
        }
        return 0;
    }
}