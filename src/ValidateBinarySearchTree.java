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
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        
        TreeNode lRightmost = root.left;
        boolean isValidLR = true;
        
        if (lRightmost != null) {
            while (lRightmost.right != null) {
                lRightmost = lRightmost.right;
            }
            isValidLR = lRightmost.val < root.val;
        }
        
        TreeNode rLeftmost = root.right;
        boolean isValidRL = true;
        
        if (rLeftmost != null) {
            while (rLeftmost.left != null) {
            rLeftmost = rLeftmost.left;
            }
            isValidRL = root.val < rLeftmost.val;
        }
        
        boolean isValidCurrentNode = isValidLR && isValidRL;
        
        return isValidCurrentNode && isValidBST(root.left) && isValidBST(root.right);
    }
}
