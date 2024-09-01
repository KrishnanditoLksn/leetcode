/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> bstList = new ArrayList<>();
        postOrderHelper(root, bstList);
        return bstList;
    }

    public void postOrderHelper(TreeNode node, List<Integer> bstList) {
        if (node != null) {
            postOrderHelper(node.left, bstList);
            postOrderHelper(node.right, bstList);
            bstList.add(node.val);
        }
    }
}