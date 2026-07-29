// Last updated: 7/29/2026, 6:00:49 PM
class Solution 
{
    public int[][] transpose(int[][] matrix)
     {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] tran = new int[cols][rows];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                tran[j][i] = matrix[i][j];
            }
        }
        return tran;
    }
}