// Last updated: 8/11/2026, 11:30:55 AM
class Solution {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        ListNode current = head;

        while (current != null) {
            result = result * 2 + current.val;
            current = current.next;
        }

        return result;
    }
}
