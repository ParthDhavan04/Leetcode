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
        ListNode current = head, prev = null, fast = null;

        while(current != null){
            fast = current.next;//fast pointer ahead of current 
            current.next = prev;
            prev = current;
            current = fast;
        }
        return prev;
    }
}
