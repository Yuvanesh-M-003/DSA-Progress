// Last updated: 7/29/2026, 5:59:03 PM
class Solution {
    public int countPartitions(int[] nums) {
        int tot=0,avg=0;
        for(int i=0;i<nums.length;i++)
        {
          tot += nums[i];
        }   
            int count =0,si=0;
            for(int i=0;i<nums.length-1;i++)
            {
                si += nums[i];
               int li= tot-si;
            avg =li+si;
           if(avg%2==0)
           {
            count++;
           }}
        return count;
}}