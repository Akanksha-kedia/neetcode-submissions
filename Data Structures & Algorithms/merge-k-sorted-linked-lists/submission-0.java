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
    public ListNode mergeKLists(ListNode[] lists) {
      List<Integer> list1= new ArrayList<>();
      if (lists.length ==0) {
        return null;
      }   
     for (int i =0; i<lists.length;i++) {
      ListNode curr = lists[i];
      while (curr != null) {
        list1.add(curr.val);
        curr = curr.next;
      }
     }
     if (list1.size() ==0) {
        return null;
     }
      Collections.sort(list1);

      ListNode dummy = new ListNode(0);
      ListNode tail = dummy;
      int i =0;
      while (i<list1.size()) {
        tail.next = new ListNode(list1.get(i));
        tail = tail.next;
        i++;
      }

     return dummy.next;
    }
}
