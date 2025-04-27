
public class implemantationdd {
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

    public static class LinedDD {
        public Node head;

        public void insertFront(int val) {
            Node newNode = new Node(val);
            if (head != null) {
                newNode.next = head;
                head.prev = newNode;
            }
            head = newNode;

        }

        public void Display() {

            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
            System.out.println();
        }

        public void Reverse() {
            if(head==null){
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.prev;
            }
            System.out.println();

        }
    }

    public static void main(Stringggg[] args) {
        LinedDD obj = new LinedDD();
        obj.insertFront(10);
        obj.insertFront(20);
        obj.insertFront(30);
        obj.insertFront(40);
        obj.insertFront(50);
      // obj.Display();
        obj.Reverse();

    }

}
