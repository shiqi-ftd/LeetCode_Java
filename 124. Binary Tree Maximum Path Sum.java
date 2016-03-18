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
    private class Result{
        int singlePath, maxPath; 
        Result(int singlePath, int maxPath) {
            this.singlePath = singlePath;
            this.maxPath = maxPath;
        }
    }
    public int maxPathSum(TreeNode root) {
        Result res = helper(root);
        return res.maxPath;
    }
    private Result helper(TreeNode root) {
        if (root == null) return new Result(0, Integer.MIN_VALUE);
        Result left = helper(root.left);
        Result right = helper(root.right);
        
        Result cur = new Result(0, Integer.MIN_VALUE);
        cur.singlePath = Math.max(Math.max(left.singlePath + root.val, right.singlePath + root.val), 0);
        cur.maxPath = Math.max(Math.max(left.maxPath, right.maxPath), left.singlePath + right.singlePath + root.val);
        return cur;
    } 
}