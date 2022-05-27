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
    public boolean areNodesPartsOfSymmetricTree(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;
        
        if (node1 == null || node2 == null)
            return false;
        
        return node1.val == node2.val &&
            areNodesPartsOfSymmetricTree(node1.left, node2.right) &&
            areNodesPartsOfSymmetricTree(node1.right, node2.left);
    }
    
    public boolean isSymmetric(TreeNode root) {
        return areNodesPartsOfSymmetricTree(root.left, root.right);
    }
}
