/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int countNodes(TreeNode root) {
        int h = getHeight(root);
        if (h == 0) return 0;
        int right = getHeight(root.right);
        if (right == h - 1) {
	    //****************************
	    // Note: can not write as (1 << h - 1 + countNodes(root.right));!!
	    // Note: can not write as (1 << (h - 1) + countNodes(root.right));!!
            return (1 << h - 1) + countNodes(root.right);
        } else {
            return (1 << h - 2) + countNodes(root.left);
        }
    }
    private int getHeight(TreeNode root) {
        if (root == null) return 0;
        return root.left == null ? 1 : 1 + getHeight(root.left);
    }
}