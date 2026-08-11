// Last updated: 8/11/2026, 11:37:28 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail = head;
        ListNode temp = head;
        for (int i = 0; i < n; i++) {
            tail = tail.next;
        }
        if (tail == null) {
            return head.next; 
        }
        while (tail.next != null) {
            tail = tail.next;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
        return head;
    }
}

       