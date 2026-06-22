class Solution {
    public int maxNumberOfBalloons(String text) {
        int res = Integer.MAX_VALUE;
        HashMap<Character , Integer> map = new HashMap<>();
        char [] arr = new char[text.length()];
        arr = text.toCharArray();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);
        for(int i=0; i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
            }
        }
        map.put('l' , map.get('l')/2);
        map.put('o' , map.get('o')/2);
        for(int c : map.values())
        {
            res = Math.min (res , c);
        }
        return res;
    }
}