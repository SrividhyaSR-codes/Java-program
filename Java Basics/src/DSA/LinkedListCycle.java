package DSA;
//Detect Cycle in Linked List — Floyd's Algorithm
public class LinkedListCycle {

    static class Node {
        int val; Node next;
        Node(int val) { this.val = val; }
    }

    public static boolean hasCycle(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true; // cycle detected
        }
        return false;
    }

    public static void main(String[] args) {

        // Test 1: List WITH cycle → 1 → 2 → 3 → 4 → 5 → back to node 3
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = head1.next.next; // cycle: 5 → 3

        System.out.println("Test 1 (cycle exists)     : " + hasCycle(head1)); // true

        // Test 2: List WITHOUT cycle → 10 → 20 → 30 → 40 → null
        Node head2 = new Node(10);
        head2.next = new Node(20);
        head2.next.next = new Node(30);
        head2.next.next.next = new Node(40);

        System.out.println("Test 2 (no cycle)         : " + hasCycle(head2)); // false

        // Test 3: Single node, no cycle
        Node head3 = new Node(99);
        System.out.println("Test 3 (single node)      : " + hasCycle(head3)); // false

        // Test 4: Single node pointing to itself
        Node head4 = new Node(7);
        head4.next = head4; // self-loop

        System.out.println("Test 4 (self-loop)        : " + hasCycle(head4)); // true

        // Test 5: Two nodes with cycle → 1 → 2 → back to 1
        Node head5 = new Node(1);
        head5.next = new Node(2);
        head5.next.next = head5; // cycle back to head

        System.out.println("Test 5 (two-node cycle)   : " + hasCycle(head5)); // true
    }
}
