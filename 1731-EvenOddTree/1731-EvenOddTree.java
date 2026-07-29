// Last updated: 7/29/2026, 5:59:50 PM
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
    public boolean isEvenOddTree(TreeNode root) {
    Queue <TreeNode> q = new LinkedList<>();
    q.add(root);
    int level =0;
    while(!q.isEmpty())
    {
        int prev, n = q.size();
        if (level % 2 == 0) prev  = Integer.MIN_VALUE;
        else prev = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
           TreeNode node = q.poll();
           int val = node.val;
           if(level % 2 == 0)
           {
                if(val%2==0||val<=prev) return false;
           }
           else
           {
                if(val%2!=0||val>=prev) return false;
           }
           prev = val;
           if(node.left!=null) q.add(node.left);
           if(node.right!=null) q.add(node.right);
        }
        level++;
    }
    return true;
    }
}