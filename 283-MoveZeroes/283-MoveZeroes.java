// Last updated: 7/23/2026, 4:10:33 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int count =0,n=0;
4        for(int i=0;i<nums.length;i++)
5        {
6            if(nums[i]!=0)
7            {
8                nums[count]=nums[i];
9                count++;
10                n++;
11            }
12        }
13        for(int i=0;i<nums.length-n;i++)
14        {
15            nums[count]=0;
16            count++;
17        }
18    }
19}