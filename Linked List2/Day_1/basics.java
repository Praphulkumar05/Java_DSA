public class basics {

    public static void display(Node head) { // For recursively calling the function.
        if (head == null)
            return;
        // Node temp=head;
        // System.out.print(head.data + " ");
        display(head.next);
        System.out.print(head.data + " ");

    }


    public static int length(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            //System.out.print(temp.data+" ");
            count++;
            temp=temp.next;
            
        }
        return count;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        // System.out.println(a.next);
        Node b = new Node(10);
        Node c = new Node(45);
        Node d = new Node(6);
        Node e = new Node(21);
        Node f = new Node(100);
        Node z = new Node(109);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = z;
        // System.out.println(a); // This will have different address.
        // System.out.println(a.next); //These two have the same address.
        // System.out.println(b); //These two have the same address.
        // System.out.println(c); //After Again this will have different address.
        Node current = a;
        System.out.print("This is the list: ");
         print(a);
         System.out.println();
       //display(a);
        System.out.print("Length of the linked list: ");
        System.out.print(length(a));

    }

}
