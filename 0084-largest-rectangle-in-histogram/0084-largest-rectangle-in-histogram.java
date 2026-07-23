import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int leftBound;
                if (stack.isEmpty()) {
                    leftBound = -1;
                } else {
                    leftBound = stack.peek();
                }
                int width = i - leftBound - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int leftBound;
            if (stack.isEmpty()) {
                leftBound = -1;
            } else {
                leftBound = stack.peek();
            }
            int width = n - leftBound - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}
