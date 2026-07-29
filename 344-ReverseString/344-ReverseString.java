// Last updated: 7/29/2026, 6:01:49 PM
class Solution {
    // public void reverse(char[]s,int l,int r)
    // {
    //     if(l>=r) return;
    //     char temp = s[l];
    //     s[l] = s[r];
    //     s[r] = temp;
    //     reverse(s,l+1,r-1);
    // }
        public void reverseString(char[] s) {
        //char [] arr = s.toCharArray();
        int l=0, r = s.length-1;
        while(l<r)
        {
            char temp = s[l];
            s[l]= s[r];
            s[r]=temp;
            l++;
            r--;
        }
        // reverse(s,0,s.length-1);
        // for(char c : s)
        // {
        //     System.out.print(c);
        // }
    }
}