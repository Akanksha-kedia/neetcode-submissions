

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        int diff = count / k;
        ListNode cur = head;

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (int i = 0; i < diff; i++) {
            List<Integer> list = new ArrayList<>();

            // Store k nodes
            for (int j = 0; j < k; j++) {
                list.add(cur.val);
                cur = cur.next;
            }

            // Create a new singly linked list in reverse order
            for (int j = list.size() - 1; j >= 0; j--) {
                tail.next = new ListNode(list.get(j));
                tail = tail.next;
            }
        }

        // Copy remaining nodes without reversing
        while (cur != null) {
            tail.next = new ListNode(cur.val);
            tail = tail.next;
            cur = cur.next;
        }

        return dummy.next;
    }
}