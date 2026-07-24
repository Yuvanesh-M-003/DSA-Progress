// Last updated: 7/24/2026, 4:21:18 PM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n = nums.length;
4
5        int[] pairXor = new int[2048];
6        int[] tripleXor = new int[2048];
7        for (int i = 0; i < n; i++) {
8            for (int j = i; j < n; j++) {
9                pairXor[nums[i] ^ nums[j]] = 1;
10            }
11        }
12        for (int i = 0; i < n; i++) {
13            for (int j = 0; j < 2048; j++) {
14                if (pairXor[j] == 1) {
15                    tripleXor[j ^ nums[i]] = 1;
16                }
17            }
18        }
19        int cnt = 0;
20        for (int value : tripleXor) {
21            if (value == 1) {
22                cnt++;
23            }
24        }
25
26        return cnt;
27    }
28}