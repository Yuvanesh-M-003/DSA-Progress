import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
    //  for(int i = 0; i < nums.length; i++){
    //         for(int j = i+1; j < nums.length; j++) {
    //             if(nums[i] + nums[j] == target) {
    //             return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[]{};
    HashMap <Integer , Integer> m = new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
        int need = target - nums[i];
        if(m.containsKey(need))
        {
        return new int []{i , m.get(need)};
        }
        m.put(nums[i] , i);
    }
    return new int[] {};
    }
}
