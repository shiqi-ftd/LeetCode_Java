/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
Method 1: My one pass solution.
public class Solution {
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        helper(root, 0 , sum);
        return flag;
    }
    private void helper(TreeNode root, int cur, int sum) {
        if (root == null) return;
        helper(root.left, cur + root.val, sum);
        if (root.left == null && root.right == null && cur + root.val == sum) {
            flag = true;
        }
        helper(root.right, cur + root.val, sum);
    }
}

Method 2:
public class Solution {
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int sum) {        
        if(root == null) return false;
        if(root.left == null && root.right == null) return sum == root.val;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}