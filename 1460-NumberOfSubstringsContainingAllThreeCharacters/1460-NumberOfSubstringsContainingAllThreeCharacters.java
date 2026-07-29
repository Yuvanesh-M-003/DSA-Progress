// Last updated: 7/29/2026, 6:00:01 PM
class Solution {
    public int numberOfSubstrings(String s) {
        int []  arr = new int [3];
        int j = 0,c = 0 ,n = s.length() ;
        for(int i=0; i<s.length(); i++)
        {
            arr[s.charAt(i) - 'a']++;
            while(arr[0] > 0 && arr[1] > 0 && arr[2] > 0)
            {
               c += n- i;
               arr[s.charAt(j) - 'a']--;
               j++;
            }
        }
        return c;
    }
}