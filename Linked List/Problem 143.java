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
    public void reorderList(ListNode head) {
        
        if (head == null || head.next == null) 
            return;

        ListNode mid = middleNode(head);

        ListNode secondHalfStart = reverseList(mid);

        ListNode firstHalf = head;
        ListNode secondHalf = secondHalfStart;

        while(firstHalf!=null && secondHalf!=null)
        {
            ListNode firstTemp = firstHalf.next;
            ListNode secondTemp = secondHalf.next;

            firstHalf.next=secondHalf;
            firstHalf = firstTemp;

            secondHalf.next=firstHalf;
            secondHalf = secondTemp;
        }
        if(firstHalf!=null) firstHalf.next = null;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
         while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

     public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode next = current.next; // Save the next node
            current.next = prev;              // Reverse the link
            prev = current;                   // Move prev forward
            current = next;               // Move current forward
        }
        
        return prev; // New head of the reversed list
    }
}
