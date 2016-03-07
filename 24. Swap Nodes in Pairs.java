/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
//      The key is to use dummy 
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        dummy.next = head;
 
        while (cur.next != null && cur.next.next != null) {
            ListNode n1 = current.next;
            ListNode n2 = current.next.next;
            cur.next = n2;
            n1.next = n2.next;
            n2.next = n1;
            cur = n1;
        }
        return dummy.next;
        
    }
}