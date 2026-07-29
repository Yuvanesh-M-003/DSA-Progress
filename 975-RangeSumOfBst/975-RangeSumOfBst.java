// Last updated: 7/29/2026, 6:00:31 PM
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
    public int rangeSumBST(TreeNode root, int low, int high) {
    // if(root == null) return 0;
    // Queue <TreeNode> q = new LinkedList<>();
    // q.add(root);
    // int sum =0;
    // while(!q.isEmpty())
    // {
    //    TreeNode curr = q.poll();
    //    if(curr.val >= low && curr.val <= high)
    //    {
    //     sum+=curr.val;
    //    }
    //    if(curr.left != null) q.add(curr.left);
    //    if(curr.right != null) q.add(curr.right);
    // }
    // return sum;
    if(root == null) return 0;
    if(root.val < low) return rangeSumBST(root.right,low,high);
    if(root.val > high) return rangeSumBST(root.left,low,high);
    return root.val + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
    }
}