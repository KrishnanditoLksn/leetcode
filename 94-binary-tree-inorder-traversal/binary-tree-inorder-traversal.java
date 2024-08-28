// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>bstList = new ArrayList<>();
        inOrderHelper(root,bstList);
        return bstList;
    }

     private void inOrderHelper(TreeNode node , List<Integer>bstList){
        if (node != null) {
            inOrderHelper(node.left,bstList);
            bstList.add(node.val);
            inOrderHelper(node.right , bstList);
        }
    }
}