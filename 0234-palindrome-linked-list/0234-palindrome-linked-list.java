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
    public boolean isPalindrome(ListNode head) {
        ListNode pt= head;
        int cnt=0;
        while(pt!=null){
            cnt++;
            pt=pt.next;
        }
        pt=head;
        int[] arr=new int[cnt];
        int a=0;
         while(pt!=null){
            arr[a]=pt.val;
            a++;
            pt=pt.next;
        }
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}