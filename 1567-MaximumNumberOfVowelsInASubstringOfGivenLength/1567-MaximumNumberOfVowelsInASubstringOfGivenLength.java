// Last updated: 7/29/2026, 5:59:58 PM
class Solution
{
    public boolean isvowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s,int k)
    {
        int count =0 ,n = s.length();
        for(int i=0;i<k;i++)
        {
            if(isvowel(s.charAt(i)))
            {
                count++;
            }
        }
        int max = count;
        for(int i=1;i<n-k+1;i++)
        {
            if(isvowel(s.charAt(i-1)))
            {
              count--;
            }
            if(isvowel(s.charAt(i+k-1)))
            {
              count++;
            }
            if(count>max)
            {
              max = count;
            }
        }
        return max;
    }
}
// class Solution {
//     public int maxVowels(String s, int k)
//     {
//         int sum = 0;
//         int count=0;
//       char [] arr = s.toCharArray();
//       for(int i=0;i<k;i++)
//       {
//         if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
//         {
//           count ++;
//         }
//       }  
//       for(int i=0;i<arr.length-k+1;i++)
//       {
//         int[] ar =new int[k];
//         for(int j=0;j<k;j++)
//         {
//             ar[j]=sc.nextInt();
//         }
//         if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
//         {
//           count ++;
//         }
//       }
// return count;
//     }
// }
// // int sum=0;
// // 		for(int  i=0; i<k; i++)
// // 		{
// // 			sum=sum+nums[i];
// // 		}
// //         int max = sum;
// // 		for(int i=1; i<nums.length-k+1; i++)
// // 		{
// // 			sum=sum-nums[i-1]+nums[i+k-1];
// //                 if(max<sum)
// //                 {
// //                     max=sum;
// //                 }
// //                 //return max;
// //             	}
// //         return (double)max/k;