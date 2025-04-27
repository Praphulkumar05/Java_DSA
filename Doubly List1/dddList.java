
public class dddList {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }

    }

    public static void Display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void DisplayReverse(Node tail) {
        Node temp2 = tail;
        while (temp2 != null) {
            System.out.print(temp2.val + " ");
            temp2 = temp2.prev;
        }
        System.out.println();
    }

    public static void Display2(Node random){
        Node temp3= random;
        while(temp3.prev!=null){
            temp3=temp3.prev;
        }
        while(temp3!=null){
            System.out.print(temp3.val+" ");
            temp3=temp3.next;

        }
        System.out.println();
    }

    public static void main(Stringggg[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.prev = null;
        a.next = b;
        b.prev = a; 
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        Display2(d);
        

    }

}
