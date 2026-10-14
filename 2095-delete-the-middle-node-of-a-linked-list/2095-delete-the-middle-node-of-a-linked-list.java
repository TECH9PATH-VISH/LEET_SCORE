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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            head=null;
            return head;
        }
        if(head.next.next==null){
            head.next=null;
            return head;
        }
        ListNode ln=head;
        ListNode lb=head;
        
        int k=0;
        while( ln!=null){
            ln=ln.next;
            k++;
        }
        k/=2;
        ln=head;
        for (int i = 0; i < k - 1; i++) {
            ln = ln.next;
        }
        ln.next=ln.next.next;
        
        return head;







    }
}