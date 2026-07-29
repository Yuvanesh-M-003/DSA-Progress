// Last updated: 7/29/2026, 5:59:06 PM
class Solution {
    public char kthCharacter(int k) {

        int shifts = Integer.bitCount(k - 1);

        return (char)('a' + shifts % 26);
    }
}