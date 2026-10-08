class Solution {

    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.val, b.val));

        // Add first node of every list
        for (ListNode node : lists) {

            if (node != null) {
                pq.offer(node);
            }
        }

        // Dummy node
        ListNode dummy = new ListNode(0);

        ListNode current = dummy;

        while (!pq.isEmpty()) {

            // Smallest node
            ListNode node = pq.poll();

            // Add to answer
            current.next = node;
            current = current.next;

            // Add next node of same list
            if (node.next != null) {
                pq.offer(node.next);
            }
        }

        return dummy.next;
    }
}