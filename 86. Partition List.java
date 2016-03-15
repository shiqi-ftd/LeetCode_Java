/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
	// To use dummy header
        ListNode dummyLow = new ListNode(0);
        ListNode low = dummyLow;
        
        ListNode dummyHigh = new ListNode(0);
        ListNode high = dummyHigh;

        while (head != null) {
            if (head.val < x) {
                low.next = head;
                low = low.next;
            } else {
                high.next = head;
                high = high.next;
            }
            head = head.next;
        }
	// Do not forget this.
        high.next = null;
        low.next = dummyHigh.next;
        return dummyLow.next;
    }
}