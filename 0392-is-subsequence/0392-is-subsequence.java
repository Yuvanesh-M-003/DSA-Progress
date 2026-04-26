class Solution {
    public boolean isSubsequence(String s, String t) {
    char [] sc = s.toCharArray();
    char [] tc = t.toCharArray();
    int l=0 , st=0;

    while(l < sc.length)
    {
        int r = 0;
        for(int i = st;i<tc.length;i++)
        {
            if(sc[l] == tc[i])
            {
                st = i+1;
                r=1;
                break;
            }
        }
        if(r == 0) return false;
        l++;
    }
    return true;
    }
}