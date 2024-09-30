public class DoubleLL {
    Node head, tail;

    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {

            this.data = data;
        }
    }


    public void remove(Node n) {
        if (n == null)
            return;


        if (n == head) {
            head = n.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }

        else if (n == tail) {
            tail = n.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        }

        else if (n.prev != null && n.next != null) {
            n.prev.next = n.next;
            n.next.prev = n.prev;
        }
    }

    public void insert(Node n) {
        if (head == null) {
            head = n;
            tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println();

    }


    public void deleteSecondToLast() {
        if (head == null || head.next == null) {

            return;
        }


        if (head.next == tail) {
            remove(head);
            return;
        }
        Node current = tail.prev;

        if (current != null) {
            remove(current);
        }
    }
}

