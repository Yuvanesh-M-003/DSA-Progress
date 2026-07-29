// Last updated: 7/29/2026, 6:00:51 PM
class Solution {
    public boolean lemonadeChange(int[] bills) {
	    Scanner x=new Scanner(System.in);
        int c1=0;
        int c2=0;
        int c3=0;
       
      
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                c1+=1;
            }
            else if(bills[i]==10)
            {
                if(c1>=1)
                {
                    c1--;
                    c2+=1;
                }
                else
                { 
                 return false;
                }
            }
            else
            {
                if(c1>=1&&c2>=1)
                {
                    c1--;
                    c2--;
                   c3+=1;  
                }
                else if(c1>=3)
                {
                    c1-=3;
                   c3+=1; 
                }
                else
                {
                 return false;
                }
            }
        }
       return true;
	}
}
