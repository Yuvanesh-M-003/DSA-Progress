// Last updated: 7/25/2026, 10:00:11 AM
1class Solution {
2    public int titleToNumber(String s) {
3        s = s.replaceAll("\\s","");
4		char[] arr = s.toCharArray();
5		int ans = 0;
6		for(int i=0;i<arr.length;i++)
7		{
8		    ans = (ans*26) + (arr[i] -'A'+1); 
9		}
10		return ans;
11    }
12}