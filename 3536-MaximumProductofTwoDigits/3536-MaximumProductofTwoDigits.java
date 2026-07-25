// Last updated: 7/25/2026, 10:17:13 AM
1class Solution {
2    public int maxProduct(int n) {
3        int prod = 1;
4        int max1 = 0, max2 = 0 ;
5        ArrayList<Integer> arr = new ArrayList<>();
6        while(n != 0)
7        {
8            int dig = n%10;
9            arr.add(dig);
10            n /= 10;
11        }
12        Collections.sort(arr);
13        prod = arr.get(arr.size()-1) * arr.get(arr.size()-2);
14        return prod;
15    }
16}