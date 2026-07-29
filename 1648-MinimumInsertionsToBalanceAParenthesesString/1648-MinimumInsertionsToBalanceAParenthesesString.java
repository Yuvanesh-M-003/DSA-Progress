// Last updated: 7/29/2026, 5:59:51 PM
class Solution {
    public int minInsertions(String s) {
        int left = 0, right = 0;
        for(char c : s.toCharArray()){
            if(c=='('){
                if(right%2!=0){
                    right--;
                    left++;
                }
                right+=2;
            }
            else{
                right--;
                if(right<0){
                    left++;
                    right=1;
                }
            }
        }
        return left+right;
    }
}