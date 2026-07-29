// Last updated: 7/29/2026, 6:04:29 PM
class Solution {
    public void sortColors(int[] nums) {
        int mid = 0,low = 0,high = nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp=nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }
            else if(nums[mid]==2)
            {
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high] = temp;
                high--;
            }
            else
            {
                mid++;
            }
        }
       for(int i=0;i<nums.length;i++)
       {
        System.out.print(nums[i]+" ");
       }
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++)
        // {
        //     System.out.print(nums[i]+" ");
        // }
    }
}