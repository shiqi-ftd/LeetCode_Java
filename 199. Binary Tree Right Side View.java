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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        HashMap<Integer, Integer> levelMap = new HashMap<Integer, Integer>(); 
        dfs(levelMap, root, 0);
        for (int i = 0; i < levelMap.size(); i++) {
            res.add(levelMap.get(i));
        }
        return res;
    }
    private void dfs(HashMap<Integer, Integer> levelMap, TreeNode root, int level) {
        if (root == null) return;
        levelMap.put(level, root.val);
        dfs(levelMap, root.left, level + 1);
        dfs(levelMap, root.right, level + 1);
    }
}