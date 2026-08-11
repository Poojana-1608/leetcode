// Last updated: 8/11/2026, 11:35:04 AM
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            // Move both pointers; if one reaches end, move it to the start of the other list
            pA = (pA != null) ? pA.next : headB;
            pB = (pB != null) ? pB.next : headA;
        }

        // Either both null or the intersection node
        return pA;
    }
}
