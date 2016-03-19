/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    TreeNode cur;
    Stack<TreeNode> itr = new Stack<TreeNode> ();
    public BSTIterator(TreeNode root) {
        cur = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (!itr.empty() || cur != null);
    }

    /** @return the next smallest number */
    public int next() {
            while (cur != null) {
                itr.push(cur);
                cur = cur.left;
            }
            cur = itr.pop();
            int val = cur.val;
            cur = cur.right;
            return val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */