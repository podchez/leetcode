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
        // finding number of nodes
        int numberOfNodes = 0;
        ListNode current = head;
        while (current != null) {
            numberOfNodes++;
            current = current.next;
        }
        
        // calculating position from start
        int posFromStart = numberOfNodes - n + 1;
        
        // removing first node
        if (posFromStart == 1)
            return head.next;
        
        current = head;
        if (posFromStart != numberOfNodes) {
            // removing middle node
            for (int i = 1; i < posFromStart; i++)
                current = current.next;
            
            current.val = current.next.val;
            current.next = current.next.next;
            
        } else {
            // removing last node
            for (int i = 1; i < posFromStart-1; i++)
                current = current.next;
            
            current.next = null;
        }
        
        return head;
    }
}
