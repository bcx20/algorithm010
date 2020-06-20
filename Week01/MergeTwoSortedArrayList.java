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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 != null && l2 == null) return l1;
        else if(l1 == null && l2 != null) return l2;
        else if(l1 == null && l2 == null) return null;
        
        if(l1.val == l2.val) {
            ListNode next = mergeTwoLists(l1.next, l2.next);
            l1.next = l2;
            l2.next = next;
            return l1;
        } else if(l1.val < l2.val) {
            ListNode next = mergeTwoLists(l1.next, l2);
            l1.next = next;
            return l1;
        } else {
            ListNode next = mergeTwoLists(l1, l2.next);
            l2.next = next;
            return l2;
        }
    }
}