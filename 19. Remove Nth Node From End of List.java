/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode fast = head;
    ListNode slow = head;
    while(fast != null) {
        fast = fast.next;
        if(n < 0) {
            slow = slow.next;
        }
        n--;
    }

    if(n == 0) {
        head = head.next;
    } else if(n < 0) {
        slow.next = slow.next.next;
    } else {
        return null;
    }

    return head;
    }
}