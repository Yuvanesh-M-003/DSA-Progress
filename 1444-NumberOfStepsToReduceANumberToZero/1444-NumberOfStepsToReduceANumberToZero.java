// Last updated: 7/29/2026, 6:00:07 PM
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num > 0)
        {
            if(num%2==0)
        {
            num /= 2;
            count++;
        }
        else
        {
            num -= 1;
            count++;
        }
        }
        return count;
    }
}