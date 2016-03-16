public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return subSymmetric(root.left, root.right);
    }
    private boolean subSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return subSymmetric(left.left, right.right) && subSymmetric(left.right, right.left);
    }
}