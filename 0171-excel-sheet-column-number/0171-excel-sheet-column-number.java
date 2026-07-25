class Solution {
    public int titleToNumber(String s) {
        s = s.replaceAll("\\s","");
		char[] arr = s.toCharArray();
		int ans = 0;
		for(int i=0;i<arr.length;i++)
		{
		    ans = (ans*26) + (arr[i] -'A'+1); 
		}
		return ans;
    }
}