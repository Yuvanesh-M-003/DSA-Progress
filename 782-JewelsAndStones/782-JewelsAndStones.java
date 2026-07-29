// Last updated: 7/29/2026, 6:00:58 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // int count =0;
        // for(int i=0;i<jewels.length();i++)
        // {
        //     char ch1 = jewels.charAt(i);
        //     for(int j=0;j<stones.length();j++)
        //     {
        //         char ch2 = stones.charAt(j);
        //         if(ch1 == ch2)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;
        HashMap <Character , Integer> map = new HashMap<>();
        for(int i=0;i<jewels.length();i++)
        {
            char c = jewels.charAt(i);
            map.put(c,map.getOrDefault(c , 0)+1);
        }
        int count = 0;
        for(int i=0;i<stones.length();i++)
        {
            char c = stones.charAt(i);
            if(map.containsKey(c))
            {
                count += 1;
            }
        }
        return count;
    }
}