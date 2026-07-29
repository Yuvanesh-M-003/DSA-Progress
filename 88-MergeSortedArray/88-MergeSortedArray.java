// Last updated: 7/29/2026, 6:04:17 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = 0;
        for(int i=m; i<n+m; i++)
        {
            nums1[i] = nums2[x];
            x++;
        }
        for(int i=0; i<nums1.length; i++)
        {
            for(int j=i+1; j<nums1.length;j++)
            {
                if(nums1[i]>nums1[j])
                {
                    int temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
    }
}
