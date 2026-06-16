class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z')
            {
                res.append(c);
            }
            if(c == '*' && !res.isEmpty())
            {
                res.setLength(res.length() - 1);
            }
            if(c == '#' && !res.isEmpty())
            {
                res = res.append(res);
            }
            if(c == '%' && !res.isEmpty())
            {
                res = res.reverse();
            }
        }
        return res.toString();
    }
}