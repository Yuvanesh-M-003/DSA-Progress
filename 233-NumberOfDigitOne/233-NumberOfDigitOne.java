// Last updated: 7/29/2026, 6:02:21 PM
class Solution {
    public int countDigitOne(int n) {
        if (n == 0) return 0;
        if (n < 10) return 1;

        int k = (int)Math.pow(10, (int)Math.log10(n));
        int q = n / k;
        int r = n % k;

        int firstPart;

        if (q > 1) {
            firstPart = k;
        } else {
            firstPart = r + 1;
        }        
        int secondPart = countDigitOne(k - 1) * q;

        return firstPart + secondPart + countDigitOne(r);
    }
}