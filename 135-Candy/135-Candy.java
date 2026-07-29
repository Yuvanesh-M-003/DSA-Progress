// Last updated: 7/29/2026, 6:03:24 PM
class Solution {
    public int candy(int[] ratings) {
        int max = 0;
        int [] arr = new int [ratings.length];
        for(int i=0; i<ratings.length; i++)
        {
            arr[i] = 1;
        }

        for(int i=0;i<ratings.length-1;i++)
        {
            if(ratings[i] < ratings[i+1])
            {
                arr[i+1] = arr[i]+1;
            }
        }
        for(int i=ratings.length-1;i>=1;i--)
        {
            if(ratings[i] < ratings[i-1])
            {
               arr[i-1] = Math.max(arr[i]+1 , arr[i-1]);
            }
        }

        for(int i=0; i<arr.length;i++)
        {
            max += arr[i];
            System.out.print(arr[i]+" ");
        } 
        return max;         
    }
}