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
        if (head == null) return false;
        
        ListNode curr = head.next;
        int n = 1;
        while (curr != null) {
            n++;
            curr = curr.next;
        }
        
        List<Integer> maybeSamePart = new ArrayList<>(n/2);
        curr = head;
        for (int i = 0; i < n/2 ; i++) {
            maybeSamePart.add(curr.val);
            curr = curr.next;
        }
        
        if (n % 2 != 0)
            curr = curr.next;
        
        for (int i = n/2 - 1; i >= 0; i--) {
            if (curr.val != maybeSamePart.get(i))
                return false;
            curr = curr.next;
        }
        
        return true;
    }
}
