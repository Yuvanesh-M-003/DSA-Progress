class Solution {
    public int trap(int[] height) {
       int left = 0, right = height.length-1 , water = 0;
       int lMax = 0, rMax = 0;
       while(left < right)
       {
        if(height[left] < height[right])
        {
            lMax = Math.max(lMax , height[left]);
            water += lMax - height[left];
            left++;
        }
        else
        {
            rMax = Math.max(rMax , height[right]);
            water += rMax - height[right];
            right--;  
        }      
       }
       return water;
    }
}
