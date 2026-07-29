// Last updated: 7/29/2026, 6:02:12 PM
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<expression.length(); i++)
        {
            char c = expression.charAt(i);

            if( c == '+' || c == '-' || c == '*')
            {

                List<Integer> left = diffWaysToCompute(expression.substring(0 , i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));

                for(int l : left)
                {
                    for(int r : right)
                    {
                        if(c == '-') result.add(l - r);
                        else if(c == '+') result.add(l + r);
                        else result.add(l * r);
                    }
                } 
            }
        }
        if(result.size() == 0)
        {
            result.add(Integer.parseInt(expression));
        }
return result;
    }
}