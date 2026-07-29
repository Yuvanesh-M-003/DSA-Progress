// Last updated: 7/29/2026, 5:59:27 PM
class Solution {
        public boolean checkString(String s) {
        for (int i = 1; i < s.length();i++) {
            if (s.charAt(i - 1) == 'b' && s.charAt(i) == 'a') {
                return false;
            }
        }
        return true;
    }
}