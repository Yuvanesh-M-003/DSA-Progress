// Last updated: 7/29/2026, 5:58:46 PM
class Solution {
    public int secondsBetweenTimes(String s, String e) {
     return time(e) - time(s);
    }
    public int time(String t)
    {
        String [] arr = t.split(":");
        int hr = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        int sec = Integer.parseInt(arr[2]);

        return ((hr*3600) + (min*60) + sec);
    }
}