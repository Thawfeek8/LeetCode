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
        ListNode temp = head;
        int count = 0;
        if(head==null && head.next==null) return null;
        while(temp!=null){
            count+=1;
            temp = temp.next;
        }
        if(n==count) return head.next;
        
        
        ListNode temp1 = head;
       for(int i=1;i<count-n;i++){
        temp1 = temp1.next;
       }
        
        temp1.next = temp1.next.next;
        return head;
    }
}