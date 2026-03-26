package DSA.LinkedListPrograms;
/*
Algorithm:
Keep 3 pointers — prev = null, curr = head, next = null
At each step: save next, point curr.next to prev, move both forward
When curr is null, prev is the new head

**Output:**
Before: 1 → 2 → 3 → 4 → 5 → null
After : 5 → 4 → 3 → 2 → 1 → null
*/

public class ReverseLinkedList {

    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    // Algorithm: 3-pointer iterative approach
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;   // Step 1: save next
            curr.next = prev;        // Step 2: reverse the pointer
            prev = curr;             // Step 3: move prev forward
            curr = next;             // Step 4: move curr forward
        }
        return prev;                 // prev is now the new head
    }

    // Helper: print the list
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
        // Build: 1 → 2 → 3 → 4 → 5 → null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Before: "); printList(head);
        head = reverse(head);
        System.out.print("After : "); printList(head);
    }
}
