// Last updated: 8/11/2026, 11:49:10 AM
class Solution {
    public int missingInteger(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            list.add(nums[i]);
        }
        int sum = 0;
        boolean temp = true;
        for(int i=1; i<nums.length; i++)
        {
           if(nums[i-1]+1 == nums[i])
           {
            sum += nums[i-1];
           }
           else
           {
            sum += nums[i-1];
            temp = false;
            break;
           }
        }
        if(temp) sum += nums[nums.length-1];
        if(!list.contains(sum)) return sum;
        sum += 1;
        boolean flag = true;
        while(flag)
        {
            if(!list.contains(sum))
            {
                break;
            }
            else
            {
                sum += 1;
            }
        } 
        return sum;
    }
}