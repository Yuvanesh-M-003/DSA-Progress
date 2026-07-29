// Last updated: 7/29/2026, 6:03:25 PM
class Solution {

    List<List<String>> result = new ArrayList<>();
    List<String> path = new ArrayList<>();

    public List<List<String>> partition(String s) {

        backtrack (s , 0);
        return result;
    }
    
    void backtrack( String s , int st)
    {
        if(st == s.length())
        {
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=st; i<s.length(); i++)
        {
             if (isPalindrome(s, st, i)) {

                path.add(s.substring(st , i + 1));  

                backtrack(s, i + 1);                 

                path.remove(path.size() - 1);          
            }
        }
    }
     private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

}