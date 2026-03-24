class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        int max=0,count =0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) > (nums.length)/2)
            {
                return nums[i];
            }
        }
        return -1;
        // int num=0,count =0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(count == 0)
        //     {
        //         num = nums[i];
        //     }
        //     if(num == nums[i]) count ++;
        //     else count--;
        // }
        // return num;
    }
}