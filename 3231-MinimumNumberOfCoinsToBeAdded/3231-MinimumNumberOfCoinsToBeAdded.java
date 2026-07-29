// Last updated: 7/29/2026, 5:59:14 PM
import java.util.Arrays;

public class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        long maxReach = 0;
        int addedCoins = 0;
        for (int coin : coins) {
            while (coin > maxReach + 1) {
                maxReach += maxReach + 1;
                addedCoins++;
            }
            maxReach += coin;
        }

        while (maxReach < target) {
            maxReach += maxReach + 1;
            addedCoins++;
        }

        return addedCoins;
    }

}