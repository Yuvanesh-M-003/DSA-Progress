// Last updated: 7/29/2026, 5:58:44 PM
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> res = new ArrayList<>();
        for(int i : bulbs)
        {
            if(!res.contains(i))
            {
                res.add(i);
            }
            else
            {
                res.remove(Integer.valueOf(i));
            }
        }
        Collections.sort(res);
        return res;
    }
}