class Solution {
    public int maxProduct(int n) {
        int prod = 1;
        int max1 = 0, max2 = 0 ;
        ArrayList<Integer> arr = new ArrayList<>();
        while(n != 0)
        {
            int dig = n%10;
            arr.add(dig);
            n /= 10;
        }
        Collections.sort(arr);
        prod = arr.get(arr.size()-1) * arr.get(arr.size()-2);
        return prod;
    }
}