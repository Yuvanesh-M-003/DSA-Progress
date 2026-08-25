class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        for(int i=1;i<=101;i++)
        {
            int num = k*i;
            if(!list.contains(num))
            {
                return num;
            }
        }
        return 0;
    }
}