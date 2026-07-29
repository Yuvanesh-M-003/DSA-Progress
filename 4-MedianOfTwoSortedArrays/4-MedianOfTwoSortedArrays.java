// Last updated: 7/29/2026, 6:05:52 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        double ans = 0;
    for (int i = 0; i < nums1.length; i++){
        res[i] = nums1[i];
    }
    for (int i = 0; i < nums2.length; i++){
        res[nums1.length + i] = nums2[i];
    }
    Arrays.sort(res);
    if(res.length % 2 != 0)
    {
        ans =  res[(res.length/2) ];
    }
    else
    {
        ans = (res[res.length / 2] + res[(res.length / 2) - 1]) / 2.0;
    }
    return ans;
    }
}