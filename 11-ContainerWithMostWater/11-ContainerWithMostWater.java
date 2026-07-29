// Last updated: 7/29/2026, 6:05:39 PM
class Solution {
    public int maxArea(int[] height) {
        int l = 0 , r = height.length-1;
        int ans = 0;
        while(l < r)
        {
            int h = Math.min(height[l] , height[r]);
            int area = h * (r-l);
            ans = Math.max(ans , area);
            if(height[l] < height[r]) 
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return ans;
    }
}