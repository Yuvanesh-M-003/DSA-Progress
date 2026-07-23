// Last updated: 7/23/2026, 4:32:26 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int c = 0 , n= nums.length;
4        for(int i=0;i<n;i++)
5        {
6           if(nums[i] != 0)
7           {
8            int temp = nums[i];
9            nums[i] = nums[c];
10            nums[c] = temp;
11            c++;
12           }
13        }
14    }
15}