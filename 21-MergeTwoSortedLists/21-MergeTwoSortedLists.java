// Last updated: 8/11/2026, 11:37:21 AM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res=new ListNode(-1);
        ListNode ptr=res;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                ptr.next=new ListNode(list1.val);
                list1=list1.next;
            }
            else{
                ptr.next=new ListNode(list2.val);
                list2=list2.next;
            }
            ptr=ptr.next;
        }
        if(list1!=null) ptr.next=list1;
        if(list2!=null) ptr.next=list2;
        return res.next;
    }
}