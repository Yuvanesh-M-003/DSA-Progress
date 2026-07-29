// Last updated: 7/29/2026, 6:03:17 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int result = 0 , res = 0;
        for(int i =0;i<tokens.length;i++)
        {
            if(!tokens[i].equals("+") &&
                !tokens[i].equals("-") &&
                !tokens[i].equals("*") &&
                !tokens[i].equals("/"))
            {
                st.push(Integer.parseInt(tokens[i]));
            }
            else if(!st.empty())
            {
                int num1 = st.pop();
                int num2 = st.pop();

                if(tokens[i].equals("*"))
                {
                    res = num1*num2;
                    st.push(res);
                }
                if(tokens[i].equals("+"))
                {
                    res = num1+num2;
                    st.push(res);
                }
                if(tokens[i].equals("-"))
                {
                    res = num2-num1;
                    st.push(res);
                }
                if(tokens[i].equals("/"))
                {
                    res = num2/num1;
                    st.push(res);
                }
            }
        }
        return st.pop();
    }
}