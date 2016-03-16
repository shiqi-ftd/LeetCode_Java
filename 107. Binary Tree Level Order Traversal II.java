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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        travel(res, 0, root);
        Collections.reverse(res);
        return res;    
    }
    private void travel(List<List<Integer>> res, int level, TreeNode cur) {
        if (cur == null) return;
        if (res.size() <= level) {
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(cur.val);
        travel(res, level + 1, cur.left);
        travel(res, level + 1, cur.right);
    }
}