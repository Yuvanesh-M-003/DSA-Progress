// Last updated: 7/29/2026, 6:02:31 PM
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
    int count = 0 ;
    public int countNodes(TreeNode root) {
        counting(root );
        return count;
    }
    public TreeNode counting( TreeNode root)
    {
        if(root == null) return null;

        count++;
        counting (root.left);
        counting(root.right);

        return root;
    }
}