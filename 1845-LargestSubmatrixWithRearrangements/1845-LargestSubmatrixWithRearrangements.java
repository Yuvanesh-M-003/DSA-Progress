// Last updated: 7/29/2026, 5:59:47 PM
import java.util.Arrays;

class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] height = new int[m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) height[j] = 0;
                else height[j] += 1;
            }

            int[] sorted = height.clone();
            Arrays.sort(sorted);

            for (int j = 0; j < m; j++) {
                ans = Math.max(ans, sorted[j] * (m - j));
            }
        }

        return ans;
    }
}