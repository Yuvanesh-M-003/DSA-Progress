// Last updated: 7/29/2026, 6:04:56 PM
class Solution 
{
    HashSet<Integer> col;
    HashSet<Integer> pos_diag;
    HashSet<Integer> neg_diag;

    char [][] board;
    List<List<String>> result;

    public List<List<String>> solveNQueens(int n) 
    {
        board = new char[n][n];

        col = new HashSet<>();
        pos_diag = new HashSet<>();
        neg_diag = new HashSet<>();

        result = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board [i][j] = '.';
            }
        }

        backtrack(0 , n);
        return result;

    }

    public void backtrack(int r , int n)
    {
        if (r == n) {
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            result.add(temp);
            return;
        }

        for(int c =0; c<n; c++)
        {
            if(col.contains(c) || pos_diag.contains(r+c) || neg_diag.contains(r-c))
            {
                continue;
            }
                col.add(c);
                pos_diag.add(r+c);
                neg_diag.add(r-c);
                board[r][c] = 'Q';

                backtrack(r+1 , n);

                col.remove(c);
                pos_diag.remove(r+c);
                neg_diag.remove(r-c);
                board[r][c] = '.'; 
        }
    }
}
