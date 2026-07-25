class Solution {
    public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while(n > 26)
		{
		    n--;
		    int rem = n%26;
		    n /= 26;
		    char c = (char) (rem+'A');
		    sb.insert(0 ,c);
		}
		if(n != 0)
		{
		    n--;
		    char c = (char) (n+'A');
		    sb.insert(0 ,c);
		}
		return sb.toString();
    }
}