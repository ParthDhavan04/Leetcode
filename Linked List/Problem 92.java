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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;                       // so that head is never lost
        ListNode prev = dummy;
        ListNode current = prev.next; 
        
        for(int i=1 ; i<left ;i++){
            prev = prev.next;
        }

        current = prev.next;

        int range = (right-left)+1;

        ListNode prevRight = null;
        ListNode fast = null;

        for(int i=0; i<range; i++){
            fast = current.next;              //fast pointer ahead of current 
            current.next = prevRight;
            prevRight = current;
            current = fast;
        }

        prev.next.next = current;
        prev.next = prevRight;

        return dummy.next;
    }
}
