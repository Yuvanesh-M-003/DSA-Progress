// Last updated: 7/29/2026, 6:00:20 PM
class Solution {
    public int tribonacci(int n) {
        int t1 = 0,t2=1,t3=1,temp=0;
        for(int i =1;i<=n;i++)
        {
             temp = t1+t2+t3;
            t1 = t2;
            t2 = t3;
            t3 = temp;
        }
        return t1;
    }
}