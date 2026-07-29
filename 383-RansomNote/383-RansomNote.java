// Last updated: 7/29/2026, 6:01:45 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      HashMap<Character , Integer> map = new HashMap<>();
      for(int i=0;i<ransomNote.length();i++)
      {
        char c = ransomNote.charAt(i);
        map.put(c , map.getOrDefault(c , 0)+1);
      }
      for(int i=0;i<magazine.length();i++)
      {
        char c = magazine.charAt(i);
        
        if(map.containsKey(c) && map.get(c) > 0)
        {
            map.put(c , map.get(c)-1);
        }
      } 

      for(int val : map.values())
      {
        if(val != 0)
        {
            return false;
        }
      }
      return true;
    }
}