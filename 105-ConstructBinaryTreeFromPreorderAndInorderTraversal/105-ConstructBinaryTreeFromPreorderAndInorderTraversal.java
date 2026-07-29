// Last updated: 7/29/2026, 6:03:44 PM
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
    int i = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] pre, int[] in, int l, int r) {
        if (l > r) return null;

        TreeNode root = new TreeNode(pre[i++]);

        int k = l;
        while (in[k] != root.val) k++;

        root.left = build(pre, in, l, k - 1);
        root.right = build(pre, in, k + 1, r);

        return root;
    }
}
