// Last updated: 7/23/2026, 11:40:49 AM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        int n = heights.length , max = 0;
4        Stack <Integer> st = new Stack<>();
5
6        for(int i=0; i<=n; i++)
7        {
8            int curr = (i == n) ? 0 : heights[i];
9            while(!st.isEmpty() && curr < heights[st.peek()])
10            {
11                int height = heights[st.pop()];
12                int width;
13                if(st.isEmpty())
14                {
15                    width = i;
16                }
17                else
18                {
19                    width = i - st.peek() - 1;
20                }
21                max = Math.max(max , width*height);
22            }
23            st.push(i);
24        }
25
26        return max;
27
28    }
29}