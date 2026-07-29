// Last updated: 7/29/2026, 6:01:21 PM
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int si=0,l,max =0;
        for(int li =1;li<nums.length;li++)
        {
            if(nums[li]-nums[si]==1)
            {
                l = li-si+1;
                if(max < l)
                {
                    max= l;
                }
            }
                while( nums[li]-nums[si]>1 && si<li)
                {
                    si++;
                }
            }
        return max;
    }
}
