/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {        
    public ListNode reverseKGroup(ListNode head, int k) {
            if (k <= 1 || head == null || head.next == null)
                return head;
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prev, start, then, tail;
            tail = prev = dummy;
            start = prev.next;
            while (true) {
                // check if there's k nodes left-out
                for (int i = 0; i < k; i++) {
                    tail = tail.next;
                    if (tail == null)
                        return dummy.next;
                }
                // reverse k nodes
                for (int i = 0; i < k - 1; i++) {
                    then = start.next;
                    start.next = then.next;
                    then.next = prev.next;
                    prev.next = then;
                }
                tail = prev = start;
                start = prev.next;
            }
        }
}
