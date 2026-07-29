// Last updated: 7/29/2026, 6:01:40 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // HashSet <Integer> s = new HashSet<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     s.add(nums[i]);
        // }
        // ArrayList <Integer> l = new ArrayList<>();
        // for(int i=1;i<nums.length+1;i++)
        // {
        //     if(!s.contains(i))
        //     {
        //         l.add(i);
        //     }
        // }
        // return l;
        int i=0;
        while(i<nums.length)
        {
            int ind = nums[i]-1;
            if(nums[i]!=nums[ind])
            {
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
            }
            else{
                i++;
            }
        }
            ArrayList <Integer> l =new ArrayList<>();
            for( i=0;i<nums.length;i++)
            {
                if(nums[i]!=i+1)
                {
                    l.add(i+1);
                }
            }
        return l;
    }
}