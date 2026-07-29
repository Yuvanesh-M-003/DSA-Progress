// Last updated: 7/29/2026, 6:03:15 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List <Integer> ans =  new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        po(root);
        return ans;
    }
    void po(TreeNode root)
    {
        if(root == null) return ;
        ans.add(root.val);
        po(root.left);
        po(root.right);
    }
}