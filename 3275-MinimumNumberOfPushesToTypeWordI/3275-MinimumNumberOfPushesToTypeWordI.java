// Last updated: 7/31/2026, 11:18:35 AM
class Solution {
    public int minimumPushes(String word) {
        int pushes = 0;
        for(int i =0;i<word.length();i++)
        {
            pushes += (i / 8) + 1;
        }
        return pushes;
    }
}