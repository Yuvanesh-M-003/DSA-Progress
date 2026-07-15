class Solution {
    public int gcdOfOddEvenSums(int n) {
        int eve = 0, odd = 0 ,ans = 0;
        for(int i=1; i<=(n*2); i++)
        {
            if(i %2 == 0)
            {
                eve += i;
            }
            else
            {
                odd += i;
            }
        }
        ans = gcd(odd , eve);
        return ans;
    }

    public static int gcd(int odd , int eve)
    {
        if(eve==0) return odd;

        return gcd(eve , odd % eve);
    }
}