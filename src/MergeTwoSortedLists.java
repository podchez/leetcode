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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null)
            return list1 == null ? list2 : list1;
        
        int val1 = list1.val;
        int val2 = list2.val;
        ListNode curr;
        if (val1 <= val2) {
            curr = new ListNode(val1);
            list1 = list1.next;
            if (list1 != null)
                val1 = list1.val;
        } else {
            curr = new ListNode(val2);
            list2 = list2.next;
            if (list2 != null)
                val2 = list2.val;
        }
        ListNode head = curr;
        
        
        while (list1 != null) {
            if (val1 <= val2 || list2 == null) { 
                curr.next = new ListNode(val1);
                list1 = list1.next;
                if (list1 != null)
                    val1 = list1.val;
            } else if (list2 != null) {
                curr.next = new ListNode(val2);
                list2 = list2.next;
                if (list2 != null)
                    val2 = list2.val;
            }
            curr = curr.next;
        }
        
        while (list2 != null) {
            curr.next = new ListNode(val2);
            list2 = list2.next;
            if (list2 != null)
                val2 = list2.val;

            curr = curr.next;
        }
        
        return head;
    }
}
