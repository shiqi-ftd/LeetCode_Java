/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode n = root;
    
        while(n != null && n.left != null) {
            TreeLinkNode pre = null;
            TreeLinkNode p = n; 
            while (p != null) {
                if(pre != null) pre.next = p.left;
                p.left.next = p.right;
                pre = p.right;
                p = p.next;
            }
            n = n.left;
        }
    }
}