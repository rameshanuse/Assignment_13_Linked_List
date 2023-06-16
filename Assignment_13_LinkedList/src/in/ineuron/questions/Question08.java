package in.ineuron.questions;

/*
💡 **Question 7**

	Given a **Doubly Linked List**, the task is to reverse the given Doubly Linked List.

 	**Example:**
 	Original Linked list 10 8 4 2
	Reversed Linked list 2 4 8 10

 */

public class Question08 {
    public static Node deleteNode(Node head, int position) {
        if (head == null) {
            return null;
        }

        if (position == 1) {
            if (head.next != null) {
                head.next.prev = null;
            }
            return head.next;
        }

        Node current = head;
        int count = 1;

        while (current != null && count < position) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return head; // Position exceeds the length of the list
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }

        return head;
    }

}

