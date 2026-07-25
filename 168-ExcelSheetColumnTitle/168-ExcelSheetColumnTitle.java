// Last updated: 7/25/2026, 9:58:14 AM
1class Solution {
2    public String convertToTitle(int n) {
3		StringBuilder sb = new StringBuilder();
4		while(n > 26)
5		{
6		    n--;
7		    int rem = n%26;
8		    n /= 26;
9		    char c = (char) (rem+'A');
10		    sb.insert(0 ,c);
11		}
12		if(n != 0)
13		{
14		    n--;
15		    char c = (char) (n+'A');
16		    sb.insert(0 ,c);
17		}
18		return sb.toString();
19    }
20}