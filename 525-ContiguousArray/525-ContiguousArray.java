// Last updated: 7/29/2026, 6:01:34 PM
class Solution {
    public int findMaxLength(int[] nums) {
    HashMap<Integer ,Integer> h = new HashMap<>();
    h.put(0,-1);
    int sum =0,maxl =0,l;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==0)
        {
            sum -= 1;
        }
            else
            {
                sum+=1;
            }
            if(h.containsKey(sum))
            {
                l=i-h.get(sum);
                maxl=Math.max(maxl,l);
            }
            else
            {
                h.put(sum,i);
            }
    }
            return maxl;
    }
}