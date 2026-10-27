class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Dummy node to handle head removals
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next; // skip the node
            } else {
                curr = curr.next; // move forward
            }
        }

        return dummy.next; // new head
    }
}
