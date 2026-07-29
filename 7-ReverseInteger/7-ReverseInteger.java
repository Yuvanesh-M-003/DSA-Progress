// Last updated: 7/29/2026, 6:05:46 PM
class Solution {
    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            int rem = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + rem;
        }

        return rev;
    }
}