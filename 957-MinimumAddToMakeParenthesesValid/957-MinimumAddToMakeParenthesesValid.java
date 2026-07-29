// Last updated: 7/29/2026, 6:00:33 PM
class Solution {
    public int minAddToMakeValid(String s) {
    int o=0,c=0;
    for(int i =0 ;i <s.length() ; i++)
    {
        if(s.charAt(i)=='(')
        {
            o++;
        }
        else
        {
            if(o>0) o--;
            else c++;
        }
    }
    return o+c;
    }
}