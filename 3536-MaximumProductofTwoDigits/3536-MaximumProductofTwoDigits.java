// Last updated: 7/25/2026, 5:54:59 PM
1class Solution {
2    public int maxProduct(int n) {
3        int prod = 1;
4        int max1 = 0, max2 = 0 ;
5        //ArrayList<Integer> arr = new ArrayList<>();
6        while(n != 0)
7        {
8            int dig = n%10;
9            if(dig > max1)
10            {
11                max2 = max1;
12                max1 = dig;
13            }
14            else if(dig <= max1 && dig > max2)
15            {
16                max2 = dig;
17            }
18            //arr.add(dig);
19            n /= 10;
20        }
21        // Collections.sort(arr);
22        // prod = arr.get(arr.size()-1) * arr.get(arr.size()-2);
23        prod = max1 * max2;
24        return prod;
25    }
26}