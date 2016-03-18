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
    public int sumNumbers(TreeNode root) {
        ArrayList<String> res = new ArrayList<String>();
        helper(root, res, "");
        int result = 0;
        for (String str : res) {
            int cur = Integer.parseInt(str);
            result += cur;
        }
        return result;
    }
    private void helper(TreeNode root, ArrayList<String> res, String cur) {
        if (root == null) return;
        cur = cur + Integer.toString(root.val);
        
        if (root.left == null && root.right == null) {
            res.add(cur);
            return;
        }
        helper(root.left, res, cur);
        helper(root.right, res, cur);
    }
}