// Last updated: 7/29/2026, 6:03:32 PM
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) 
        {
            if (price < minPrice) 
            {
                minPrice = price; 
            }
            else 
            {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}