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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<String>();
        if (root != null) searchBT(root, "", answer);
        return answer;
    }
    private void searchBT(TreeNode root, String path, List<String> answer) {
        if (root.left == null && root.right == null) answer.add(path + root.val);
        if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
        if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
    }
}

// Method 2, no helper


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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if (root == null) return res;
        if (root.left == null && root.right == null) {
            res.add(root.val + "");
            return res;
        }
        if (root.left != null) {
            List<String> left = binaryTreePaths(root.left);
            for (String leftPath : left) {
                res.add(root.val + "->" + leftPath);
            }
        }
        if (root.right != null) {
            List<String> right = binaryTreePaths(root.right);
            for (String rightPath : right) {
                res.add(root.val + "->" + rightPath);
            }
        }
        return res;
    }
}