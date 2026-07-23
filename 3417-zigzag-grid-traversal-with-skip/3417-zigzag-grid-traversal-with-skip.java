class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        ArrayList <Integer> ans = new ArrayList<>();
        int n = grid.length , m = grid[0].length;
        for(int i=0;i<n;i++)
        {
            if(i%2 == 0 || i == 0)
            {
                for(int j=0;j<m;j++)
                {
                    if(j == 0 || j%2 == 0)
                    {
                        ans.add(grid[i][j]);
                    }
                }
            }
            else
            {
                for(int j=m-1;j>=0;j--)
                {
                    if(j%2 != 0)
                    {
                        ans.add(grid[i][j]);
                    }
                }
            }
        }
        return ans;
    }
}