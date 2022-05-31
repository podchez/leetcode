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
        if (head == null || head.next == null)
            return head;
        
        ListNode previous = null, next = head.next;
        head.next = null; // to remove looping in list
        
        while (next != null) {
                                  // 1st iter:  // 2nd iter:
            previous = head;      // 1          // 2
            head = next;          // 2          // 3
            next = head.next;     // 3          // 4
            
            head.next = previous; // 2 -> 1     // 3 -> 2
        }
        
        return head;
    }
}
