package DSA.LinkedListPrograms;
/*
Algorithm (Floyd's slow/fast pointer):

1.slow moves 1 step, fast moves 2 steps
2.When fast reaches end, slow is exactly at the middle
3.For even-length lists, returns the second middle node

**Output:**
List    : 1 → 2 → 3 → 4 → 5 → null
Middle  : 3
List    : 1 → 2 → 3 → 4 → 5 → 6 → null
Middle  : 4
List    : 42 → null
Middle  : 42
 */

public class FindMiddleNode {

    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    // Algorithm: slow/fast pointer (Floyd's technique)
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // moves 1 step
            fast = fast.next.next;   // moves 2 steps
        }
        return slow;                 // slow is at the middle
    }

    public static void printList(Node head) {
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.val);
            if (temp.next != null) sb.append(" → ");
            temp = temp.next;
        }
        sb.append(" → null");
        System.out.println(sb);
    }

    public static void main(String[] args) {
        // Test 1: Odd length → 1 → 2 → 3 → 4 → 5
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        System.out.print("List    : "); printList(head1);
        System.out.println("Middle  : " + findMiddle(head1).val); // 3

        // Test 2: Even length → 1 → 2 → 3 → 4 → 5 → 6
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);
        head2.next.next.next.next.next = new Node(6);
        System.out.print("\nList    : "); printList(head2);
        System.out.println("Middle  : " + findMiddle(head2).val); // 4 (2nd middle)

        // Test 3: Single node
        Node head3 = new Node(42);
        System.out.print("\nList    : "); printList(head3);
        System.out.println("Middle  : " + findMiddle(head3).val); // 42
    }
}