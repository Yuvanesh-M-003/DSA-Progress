// Last updated: 7/29/2026, 5:58:41 PM
class Solution {

    public static int gcd (int a, int b)
    {
        if(b == 0) return a;
        return gcd (b, a%b);
    }
    public long gcdSum(int[] nums) {
        long ans = 0;
        int [] mx = new int [nums.length];
        int max = 0;
        for(int i=0;i<nums.length;i++)
        {
            max = Math.max(nums[i] , max);
            mx[i] = max;
        }

        int temp = 0;
        for(int i=0;i<nums.length;i++)
        {
            temp = gcd (nums[i] , mx[i]);
            mx[i] = temp; 
        }

        Arrays.sort(mx);
        int l=0 , r=mx.length-1;
        while(l < r)
        {
            temp = gcd (mx[l] , mx[r]);
            ans += temp;
            l++;
            r--;
        }
        return ans;
    }
}