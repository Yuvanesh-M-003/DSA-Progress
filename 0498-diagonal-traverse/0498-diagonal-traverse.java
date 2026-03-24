class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int [] res = new int[m*n];
        int x = m + n , z = 0;
        if(mat == null || mat.length == 0) return new int [0];

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<x;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i = 0 ;i < m; i++)
        {
            for(int j = 0 ;j < n ; j++)
            {
                list.get(i+j).add(mat[i][j]); 
            }
        }
        for(int i =0; i< x;i++)
        {
            if(i % 2 == 0)
            {
                  Collections.reverse(list.get(i));
                  for(int j : list.get(i))
                  {
                    res[z++] = j;
                  }
            }
            else
            {
                for(int j : list.get(i))
                {
                    res[z++] = j;
                }
            }
        }
        System.out.print(list);
        return res; 
    }
}