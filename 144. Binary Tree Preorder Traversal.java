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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        Stack<TreeNode> stk = new Stack<TreeNode>();
        if (root == null) return res;
        
        stk.push(root);
        
        while (!stk.empty()) {
            TreeNode cur = stk.pop();
            res.add(cur.val);
            if (cur.right != null) {
                stk.push(cur.right);
            }
            if (cur.left != null) {
                stk.push(cur.left);
            }
        }
        
        return res;
    }
}