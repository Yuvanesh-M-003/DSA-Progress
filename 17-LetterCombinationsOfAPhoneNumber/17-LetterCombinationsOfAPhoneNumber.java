// Last updated: 7/29/2026, 6:05:32 PM
class Solution {
    static HashMap<Character,String> map;
    static List<String> res;
    public List<String> letterCombinations(String digits) {
    res  = new ArrayList<>();
    int n = digits.length();
    if(n==0) return res;
    map = new HashMap<>();
    map.put('2',"abc"); 
    map.put('3',"def"); 
    map.put('4',"ghi"); 
    map.put('5',"jkl"); 
    map.put('6',"mno"); 
    map.put('7',"pqrs"); 
    map.put('8',"tuv"); 
    map.put('9',"wxyz");
    bt(digits , new StringBuilder() , 0);
    return res;
    }
    void bt(String digits , StringBuilder path , int i)
    {
     if(i==digits.length())
     {
        res.add(path.toString());
        return;
     }
     String x = map.get(digits.charAt(i));
     for(char c : x.toCharArray())
    {
        path.append(c);
        bt(digits , path , i+1);
        path.deleteCharAt(path.length()-1);
    }
    }
}