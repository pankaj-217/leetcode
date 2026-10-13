class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= n; i++) {
            int currentHeight;
            if (i == n) {
                currentHeight = 0;
            } else {
                currentHeight = heights[i];
            }
            while (!stack.isEmpty()
                    && heights[stack.peek()] > currentHeight) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return maxArea;
    }
}