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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
            // Stack<ListNode> st = new Stack<>();
            // while(head!=null){
            //     st.push(head);
            //     head = head.next;
            // }
            // ListNode dummy = new ListNode(-1,null);
            // ListNode temp = dummy;
            // while(!st.isEmpty()){
            //     temp.next = st.pop();
            //     temp = temp.next;
            // }
            // temp.next = null;
            // return dummy.next;
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}