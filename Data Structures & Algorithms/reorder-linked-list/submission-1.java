
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        int count = 0;
        ListNode curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        int count1 = (int) Math.ceil(count / 2.0);
        int diff = count - count1;

        ListNode curr1 = head;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < count1; i++) {
            list1.add(curr1.val);
            curr1 = curr1.next;
        }

        for (int i = 0; i < diff; i++) {
            list2.add(curr1.val);
            curr1 = curr1.next;
        }

        Collections.reverse(list2);

        ListNode head1 = new ListNode(list1.get(0));
ListNode prev = head1;

for (int i = 0; i < diff; i++) {
    prev.next = new ListNode(list2.get(i));
    prev = prev.next;

    if (i + 1 < count1) {
        prev.next = new ListNode(list1.get(i + 1));
        prev = prev.next;
    }
}

        // Add the remaining middle node for odd-length lists
        if (count1 > diff) {
            prev.next = new ListNode(list1.get(count1 - 1));
        }

        // Copy reordered values into the original nodes
        curr = head;
        ListNode curr2 = head1;

        while (curr != null && curr2 != null) {
            curr.val = curr2.val;
            curr = curr.next;
            curr2 = curr2.next;
        }
    }
}
