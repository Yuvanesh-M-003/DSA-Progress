// Last updated: 7/23/2026, 6:18:31 PM
1class Solution {
2    public List<Integer> zigzagTraversal(int[][] grid) {
3        ArrayList <Integer> ans = new ArrayList<>();
4        int n = grid.length , m = grid[0].length;
5        for(int i=0;i<n;i++)
6        {
7            if(i%2 == 0 || i == 0)
8            {
9                for(int j=0;j<m;j++)
10                {
11                    if(j == 0 || j%2 == 0)
12                    {
13                        ans.add(grid[i][j]);
14                    }
15                }
16            }
17            else
18            {
19                for(int j=m-1;j>=0;j--)
20                {
21                    if(j%2 != 0)
22                    {
23                        ans.add(grid[i][j]);
24                    }
25                }
26            }
27        }
28        return ans;
29    }
30}