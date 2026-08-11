// Last updated: 8/11/2026, 11:34:47 AM
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
             if(temp.val==val){
                if(prev==null){
                head=head.next;
                temp=head;
             }
             else{
                prev.next=temp.next;
                temp=temp.next;
             } 
             }
            else{
              prev=temp;
              temp=temp.next;
            }
        }
        return head;
    }
}

