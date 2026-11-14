class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length and tail
        int n = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        k %= n;
        if (k == 0) {
            return head;
        }

        // Make list circular
        tail.next = head;

        // Find new tail
        int steps = n - k - 1;
        ListNode newTail = head;

        for (int i = 0; i < steps; i++) {
            newTail = newTail.next;
        }

        // New head
        ListNode newHead = newTail.next;

        // Break the circle
        newTail.next = null;

        return newHead;
    }
}