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
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        if (list.size() ==0)
        {
            return head;
        } 
        ListNode newcurr = new ListNode(list.get(list.size()-1), null);
        ListNode head1 = newcurr;
    

        for (int i =list.size()-2; i>=0; i--) {
           newcurr.next = new ListNode(list.get(i), null);
           newcurr = newcurr.next;
        }

    return head1;
    }
}
