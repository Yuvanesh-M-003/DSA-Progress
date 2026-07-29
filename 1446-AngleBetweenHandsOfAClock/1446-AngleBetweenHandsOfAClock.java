// Last updated: 7/29/2026, 6:00:04 PM
class Solution {
    public double angleClock(int hour, int minutes) {
        double hr = (hour*30 + minutes*0.5);
        double min = minutes*6;
        double diff = hr - min;
        if(diff < 0)
        {
            diff *= -1.00;
        }
        return Math.min(diff, 360-diff);
    }
}