class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
    int n = (grid.length) * (grid[0].length);
    int ex = (n * (n + 1)) / 2;
    int tot = 0 , num = 0;
    int [] ans = new int [2];
    HashMap <Integer , Integer> map = new HashMap<>();
    for(int i = 0;i<grid.length; i++)
    {
        for(int j =0 ;j < grid[0].length;j++)
        {
            tot += grid[i][j];
            map.put(grid[i][j] , map.getOrDefault(grid[i][j] , 0)+1);
            if(map.get(grid[i][j]) == 2)
            {
                num = grid[i][j];
            }
        }
    }
    ans[0] = num;
    ans[1] = ex - (tot - num);  
    return ans;
    }
}