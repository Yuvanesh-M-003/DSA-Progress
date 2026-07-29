// Last updated: 7/29/2026, 5:58:57 PM
class Solution {
    public int maxProduct(int n) {
        int prod = 1;
        int max1 = 0, max2 = 0 ;
        //ArrayList<Integer> arr = new ArrayList<>();
        while(n != 0)
        {
            int dig = n%10;
            if(dig > max1)
            {
                max2 = max1;
                max1 = dig;
            }
            else if(dig <= max1 && dig > max2)
            {
                max2 = dig;
            }
            //arr.add(dig);
            n /= 10;
        }
        // Collections.sort(arr);
        // prod = arr.get(arr.size()-1) * arr.get(arr.size()-2);
        prod = max1 * max2;
        return prod;
    }
}