// Last updated: 7/29/2026, 6:00:23 PM
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int [] arr = new int[n+1];
        for(int i= 0;i<bookings.length;i++)
        {
            int si = (bookings[i][0]-1);
            int li = bookings[i][1];
            int val = bookings[i][2];
        //     for(int k=si-1;k<li;k++)
        //     {
        //       arr[k]+=val;
        //     }
        // }
        arr[si]+=val;
        arr[li]-=val;
        }
        int prefixSum = arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i]+=prefixSum;
            prefixSum = arr[i];
        }
        int [] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=arr[i];
        }
        return a;
    }
}