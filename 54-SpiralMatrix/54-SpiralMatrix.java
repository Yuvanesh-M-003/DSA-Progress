// Last updated: 7/29/2026, 6:04:53 PM
class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        
        ArrayList<Integer> res = new ArrayList<>();

        int n = mat[0].length;
        int m = mat.length;

        int l = 0;
        int r = n-1;
        int t = 0;
        int b = m-1;

        while(t<=b && l<=r)
        {

            for(int i=l;i<=r;i++)
            {
                res.add(mat[t][i]);
            }
            t++;

            for(int i=t;i<=b;i++)
            {
                res.add(mat[i][r]);
            }
            r--;

            if(t <= b)
            {
                for(int i=r;i>=l;i--)
                {
                    res.add(mat[b][i]);
                }
                b--;
            }

            if(l <= r)
            {
                for(int i=b;i>=t;i--)
                {
                    res.add(mat[i][l]);
                }
                l++;   
            }
            
        }

        return res;
    }
}