public class LinkedListImplementation {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class QuLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void aDd(int val) {
            Node temp = new Node(val);
            if (size == 0) {

                tail = head = temp;

            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;

        }

        public int peek() {
            return head.val;
        }

        public int rEmove() {
            if (size == 0) {
                System.out.println("Queue is empty");
            }
            int p = head.val;
            head = head.next;
            size--;
            return p;

        }

        public void display() {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        QuLL l = new QuLL();
        l.aDd(1);
        l.aDd(2);
        l.aDd(3);
        l.aDd(4);
        l.aDd(5);
        l.aDd(6);
        l.display();
        // System.out.println(l.rEmove());

    }

}
