// Last updated: 7/23/2026, 4:30:37 PM
1class Solution {
2    public int[] applyOperations(int[] nums) {
3        int n = nums.length;
4
5        for(int i=0;i< n-1;i++)
6        {
7            if(nums[i] == nums[i+1] && nums[i] != 0)
8            {
9                nums[i] = nums[i]*2;
10                nums[i+1] = 0;
11            }
12        }
13        
14        int c = 0;
15        for(int i=0;i<n;i++)
16        {
17           if(nums[i] != 0)
18           {
19            int temp = nums[i];
20            nums[i] = nums[c];
21            nums[c] = temp;
22            c++;
23           }
24        }
25        return nums;
26    }
27}