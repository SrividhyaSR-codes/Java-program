package DSA.LinkedListPrograms;
/*
Merge Two Sorted Linked Lists
Given the heads of two sorted linked lists, merge them into a single sorted linked list and return
Algorithm:
1.Use a dummy node as the starting anchor
2.Compare heads of both lists — attach the smaller one to result
3.Advance that list's pointer
4.When one list exhausts, attach the remaining list directly
        **Output:**
        ```
List 1  : 1 → 3 → 5 → null
List 2  : 2 → 4 → 6 → null
Merged  : 1 → 2 → 3 → 4 → 5 → 6 → null

List 3  : 10 → 20 → null
List 4  : null
Merged  : 10 → 20 → null
 */

public class MergeSortedLists {

    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    // Algorithm: dummy node + two-pointer comparison
    public static Node mergeSorted(Node l1, Node l2) {
        Node dummy = new Node(0);   // anchor node — result builds from here
        Node curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;     // pick from list 1
                l1 = l1.next;
            } else {
                curr.next = l2;     // pick from list 2
                l2 = l2.next;
            }
            curr = curr.next;       // advance result pointer
        }

        // attach remaining nodes (one list may still have elements)
        curr.next = (l1 != null) ? l1 : l2;

        return dummy.next;          // skip dummy, return actual head
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
        // List 1: 1 → 3 → 5 → null
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        // List 2: 2 → 4 → 6 → null
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        System.out.print("List 1  : "); printList(l1);
        System.out.print("List 2  : "); printList(l2);
        Node merged = mergeSorted(l1, l2);
        System.out.print("Merged  : "); printList(merged);

        // Edge case: one empty list
        Node l3 = new Node(10);
        l3.next = new Node(20);
        System.out.print("\nList 3  : "); printList(l3);
        System.out.print("List 4  : null\n");
        Node merged2 = mergeSorted(l3, null);
        System.out.print("Merged  : "); printList(merged2);
    }
}

