// Last updated: 7/27/2026, 11:23:01 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max1 = 0, max2 = 0;
4        for(int num : nums)
5        {
6            if(num > max1)
7            {
8                max2 = max1;
9                max1 = num;
10            }
11            else if(num > max2 && num <= max1)
12            {
13                max2 = num;
14            }
15        }
16        return (max1 -1) * (max2 -1);
17    }
18}