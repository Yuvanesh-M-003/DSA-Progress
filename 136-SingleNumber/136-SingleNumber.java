// Last updated: 7/29/2026, 6:03:22 PM
import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashSet <Integer> ans = new HashSet<>();
        for(int num : nums)
        {
            if(ans.contains(num))
            {
                ans.remove(num);
            }
            else
            {
                ans.add(num);
            }
        }
        return ans.iterator().next();
    }
}