// Last updated: 7/29/2026, 6:03:12 PM
class Solution {
    public String reverseWords(String s) {
        String [] arr = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder ();
        for(int i=arr.length-1;i>0;i--)
        {
            ans.append(arr[i]);
            ans.append(" ");
        }
        ans.append(arr[0]);
        return ans.toString();
    }
}