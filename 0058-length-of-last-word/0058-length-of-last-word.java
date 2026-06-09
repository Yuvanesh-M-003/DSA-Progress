class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0,l=1;
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            if(ch == ' ')
            {
                if(count == 0)
                {
                    l++;
                    continue; 
                }
                break;
            }
            else
            {
                count++;
            }
        }
        return count;
    }
}