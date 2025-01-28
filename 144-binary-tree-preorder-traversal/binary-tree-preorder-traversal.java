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
     public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> bst = new ArrayList<>();
        preOrderHelper(root, bst);
        return bst;
    }

      public void preOrderHelper(TreeNode node, List<Integer> bst) {
        if (node != null) {
            bst.add(node.val);
            preOrderHelper(node.left, bst);
            preOrderHelper(node.right,bst);
        }
    }
}