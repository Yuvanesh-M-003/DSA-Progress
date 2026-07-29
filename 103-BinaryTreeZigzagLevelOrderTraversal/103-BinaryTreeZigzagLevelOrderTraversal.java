// Last updated: 7/29/2026, 6:03:45 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res ;
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean l = true;
        while(!q.isEmpty())
        {
            int n = q.size();
            Deque <Integer> lev = new LinkedList <>();
               for(int i=0;i<n;i++)
               {
                TreeNode node = q.poll();
                if(l)
                {
                    lev.addLast(node.val);
                }
                else
                {
                    lev.addFirst(node.val);
                }
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
               }
               res.add(new ArrayList<>(lev));
            l = !l;
        }
        return res;
    }
}