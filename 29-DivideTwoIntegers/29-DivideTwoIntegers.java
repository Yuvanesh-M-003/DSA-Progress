// Last updated: 7/29/2026, 6:05:14 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1)
        {
            return 2147483647;
        }
    return dividend / divisor;
    }
}