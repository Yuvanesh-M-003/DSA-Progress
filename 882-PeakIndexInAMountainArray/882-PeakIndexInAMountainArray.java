// Last updated: 7/29/2026, 6:00:53 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int mid,si=1,li=arr.length-2;
       while(si<=li)
       {
        mid = (si+li)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
        {
            return mid;
        }
        else if(arr[mid]>arr[mid-1] )
        {
            si = mid +1;
        }
        else 
        {
            li = mid -1;
        }
       }
        return 0;
    }    

}