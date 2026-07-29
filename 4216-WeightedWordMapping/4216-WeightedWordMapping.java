// Last updated: 7/29/2026, 5:58:43 PM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        char var = 'a';
        HashMap <Character , Integer> map = new HashMap<>();
        for(int i=0; i<26; i++)
        {
            map.put(var , weights[i]);
            var++;
        }

        for(int i=0; i<words.length; i++)
        {
            int num = 0;
            for(int j=0; j<words[i].length(); j++)
            {
                char c = words[i].charAt(j);
                num += map.get(c);
            }
            num %= 26;
            ans.append((char)('z' - num));
        }
        return ans.toString();
    }
}