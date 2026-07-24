// Last updated: 7/24/2026, 5:36:27 PM
1class Solution {
2        public boolean checkString(String s) {
3        for (int i = 1; i < s.length();i++) {
4            if (s.charAt(i - 1) == 'b' && s.charAt(i) == 'a') {
5                return false;
6            }
7        }
8        return true;
9    }
10}