// Last updated: 7/28/2026, 3:04:15 PM
1class Solution {
2    public int partitionDisjoint(int[] nums) {
3        int lMax = nums[0];
4        int max = nums[0];
5        int ans = 0;
6        
7        for (int i = 1; i < nums.length; i++) {
8            if (nums[i] > max) {
9                max = nums[i];
10            }
11            
12            if (nums[i] < lMax) {
13                lMax = max;
14                ans = i;
15            }
16        }
17        
18        return ans + 1;
19    }
20}
21