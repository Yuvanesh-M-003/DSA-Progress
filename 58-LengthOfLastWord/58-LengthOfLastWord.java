// Last updated: 7/29/2026, 6:04:48 PM
class Solution {
    public int lengthOfLastWord(String s) {
       String [] str = s.split(" ");
       return str[str.length-1].length();
    }
}