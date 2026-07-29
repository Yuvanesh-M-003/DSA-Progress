// Last updated: 7/29/2026, 5:59:10 PM
class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;

        for(char ch = 'a'; ch <= 'z'; ch++) {
            
            if(word.indexOf(ch) != -1 && 
               word.indexOf(Character.toUpperCase(ch)) != -1) {
                
                count++;
            }
        }

        return count;
    }
}