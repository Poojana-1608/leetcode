// Last updated: 8/11/2026, 11:35:15 AM
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
    public ListNode insertionSortList(ListNode head) {
        ListNode d=new ListNode(0);
        while(head!=null){
            ListNode prev=d;
            while(prev.next!=null && prev.next.val<head.val){
                prev=prev.next;
            }
            ListNode next=head.next;
            head.next=prev.next;
            prev.next=head;
            head=next;
        }
        return d.next;
    }
}