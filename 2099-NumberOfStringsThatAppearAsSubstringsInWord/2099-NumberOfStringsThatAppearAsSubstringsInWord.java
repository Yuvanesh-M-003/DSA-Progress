// Last updated: 7/29/2026, 5:59:36 PM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c = 0;
        for(int i=0; i<patterns.length; i++)
        {
            if(word.contains(patterns[i]))
            {
                c ++;
            }
        }
        return c;
    }
}