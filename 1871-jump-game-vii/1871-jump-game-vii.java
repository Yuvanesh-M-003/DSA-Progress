class Solution 
{
    public boolean canReach(String s, int minJump, int maxJump) 
    {
        int n = s.length();

        boolean[] reach = new boolean[n];

        reach[0] = true;

        int reachable = 0;

        for(int i = 1; i < n; i++)
        {
            if(i - minJump >= 0 && reach[i - minJump])
            {
                reachable++;
            }
            if(i - maxJump - 1 >= 0 && reach[i - maxJump - 1])
            {
                reachable--;
            }
            if(s.charAt(i) == '0' && reachable > 0)
            {
                reach[i] = true;
            }
        }

        return reach[n - 1];
    }
}