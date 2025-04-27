public class ImplementationOFDequeDDLL {
    public static class Node {
        Node next;
        Node prev;
        int val;

        Node(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    public static class Deque {
        public Node head;
        public Node prev; // Represents the tail (last node)
        int size = 0;

        public void PushFront(int val) {
            Node newNode = new Node(val);
            if (head != null) {
                newNode.next = head;
                head.prev = newNode;
            } else {
                prev = newNode; // If the list was empty, update prev to new node
            }
            head = newNode;
            size++;
        }

        public void PopBack() {
            if (head == null) {
                System.out.println("Deque is empty!");
                return;
            }
            if (head.next == null) {
                head = prev = null;
                size = 0;
                return;
            }
            prev = prev.prev;
            prev.next = null;
            size--;
        }

        public void aDd(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = prev = temp;
            } else {
                prev.next = temp;
                temp.prev = prev;
                prev = temp;
            }
            size++;
        }

        public int rEmove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1; // Return a default error value
            }
            int p = head.val;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                prev = null; // If the queue becomes empty, update prev
            }
            size--;
            return p;
        }

        public void Display() {
            Node temp = head; // Use a temp node to traverse
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Deque d = new Deque();
        d.PushFront(10);
        d.PushFront(20);
        d.PushFront(30);
        d.PushFront(40);
        d.PushFront(50);
        d.Display();
        d.PopBack();
        d.Display();

        // Testing additional functions
        d.aDd(60);
        d.aDd(70);
        d.Display();
        System.out.println("Removed: " + d.rEmove());
        d.Display();
    }
}
 //need to visit again....