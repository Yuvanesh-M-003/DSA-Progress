class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length , max = 0;
        Stack <Integer> st = new Stack<>();

        for(int i=0; i<=n; i++)
        {
            int curr = (i == n) ? 0 : heights[i];
            while(!st.isEmpty() && curr < heights[st.peek()])
            {
                int height = heights[st.pop()];
                int width;
                if(st.isEmpty())
                {
                    width = i;
                }
                else
                {
                    width = i - st.peek() - 1;
                }
                max = Math.max(max , width*height);
            }
            st.push(i);
        }

        return max;

    }
}