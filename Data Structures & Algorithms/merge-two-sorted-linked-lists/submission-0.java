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
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        List<Integer> list = new ArrayList<>();
        while (curr1 != null) {
            list.add(curr1.val);
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            list.add(curr2.val);
            curr2 = curr2.next;
        }
        if (list.size() == 0)
        {
            return list1;
        } 

        Collections.sort(list);
        ListNode newcurr = new ListNode(list.get(0), null);
        ListNode head1 = newcurr;
    

        for (int i =1; i<list.size(); i++) {
           newcurr.next = new ListNode(list.get(i), null);
           newcurr = newcurr.next;
        }
       return head1;

    }
}