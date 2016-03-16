// Iterative
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        TreeNode cur = root;
        Stack<TreeNode> stk = new Stack<TreeNode>();
        while (cur != null || !stk.empty()) {
            while (cur != null) {
                stk.push(cur);
                cur = cur.left;
            }
            TreeNode popNode = stk.pop();
            res.add(popNode.val);
            cur = popNode.right;
        }
        return res; 
        
    }
}

// Recursive
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) return;
        helper(root.left, res);
        res.add(root.val);
        helper(root.right, res);
    }
}