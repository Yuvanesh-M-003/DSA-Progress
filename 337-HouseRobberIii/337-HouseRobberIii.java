// Last updated: 7/29/2026, 6:01:53 PM
class Solution {
    public int rob(TreeNode root) {
        int[] res = helper(root);
        return Math.max(res[0], res[1]);
    }

    // res[0] = max if we do NOT rob this node
    // res[1] = max if we DO rob this node
    private int[] helper(TreeNode node) {
        if (node == null) return new int[]{0, 0};

        int[] left = helper(node.left);
        int[] right = helper(node.right);

        int rob = node.val + left[0] + right[0];       // rob this node
        int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]); // skip this node

        return new int[]{notRob, rob};
    }
}