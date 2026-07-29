// Last updated: 7/29/2026, 6:03:29 PM
class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", ""); 
        result = result.toLowerCase();
        char [] arr = result.toCharArray();
        int l = 0 , r = arr.length - 1;
        while(l < r)
        {
            if(arr[l] == arr[r])
            {
                l++;
                r--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}