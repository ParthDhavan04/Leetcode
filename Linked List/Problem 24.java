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
    public ListNode swapPairs(ListNode head) {
        
        if (head == null || head.next == null) return head;
        else{
        ListNode fNode = head;
        ListNode sNode = head.next;
        fNode.next=swapPairs(sNode.next);
        sNode.next = fNode;

        return sNode;
        }
        
        //Iterative Code
        // ListNode dummy = new ListNode(0);
        // dummy.next = head;

        // ListNode prev = dummy;
        // ListNode current = head; 

        
        // while (current != null && current.next != null) {
        //     ListNode fast = current.next; 
           
        //     current.next = fast.next; 
        //     fast.next = current; 
        //     prev.next = fast; // Connect previous to the new first node (fast)

        //     // Move prev and current to the next pair
        //     prev = current; 
        //     current = current.next;
        // }

        // return dummy.next; 
    }
}
