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
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        if (head.next == null) {
            return false;
        }
        if (head.next.next == null) {
            return false;
        }
        ListNode fast = head.next.next;
        ListNode slow = head;

        while (fast !=slow && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast == slow) {
        return true; }
        else {
            return false;
        }
    }
}
