public class basicll {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }

    }
    public static void print(Node head){                        //function for printing the linked list.
        Node temp=head;
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5); /// before linking. 
        // System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node temp = a;
        System.out.print("The new Linked List is: ");
        print(a);






    //    while(temp!=null){           //display/ printing the linked list.
    //     System.out.print(temp.data+" ");
    //     temp=temp.next;
    //    }







        // System.out.println(a.next);
        // System.out.println(b.data); // This is the method 1 to prnt the data direct
        // System.out.println(a.next.data);
        // System.out.println(e.next.data); // 2 method( printing the data using "a"
        // node )

        // System.out.println(b); //after linking..
        // System.out.println(e);
        // System.out.println(b.next); //it will print null bcz it is not linked.

        // System.out.println(a.next.data);

    }

}
