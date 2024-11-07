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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k<=0) 
        return head; 

        ListNode secondLast=head,tail=head,temp=head;

        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        
        tail.next = head;
        int rotations = k % length;
        int skip = length - rotations;

        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;
        
        return head;
    }
}
