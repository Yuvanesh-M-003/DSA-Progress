class Solution {
    public int lengthOfLastWord(String s) {
       String [] str = s.split(" ");
       String x = str[str.length-1];
       return x.length();
    }
}