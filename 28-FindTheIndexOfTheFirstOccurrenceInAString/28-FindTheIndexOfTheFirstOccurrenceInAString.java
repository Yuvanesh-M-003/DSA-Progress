// Last updated: 7/29/2026, 6:05:16 PM
class Solution {
    public int strStr(String haystack, String needle) {
    
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
         if(haystack.substring(i, i+needle.length()).equals(needle))
         {
            return i;
         }
        }
    
    return -1;
}
}