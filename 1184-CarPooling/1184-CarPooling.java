// Last updated: 7/29/2026, 6:00:25 PM
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int arr[] = new int[1001];
        for(int i=0;i<trips.length;i++)
        {
            int pas = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];
            arr[from]+=pas;
            arr[to]-=pas;
        }
        int ps = arr[0];
        if(ps>capacity)return false;
        for(int i=1;i<1001;i++)
        {
           arr[i]+=ps;
           ps = arr[i];
           if(arr[i]>capacity)return false;
        }
return true;
    }
}