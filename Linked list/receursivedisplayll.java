
public class receursivedisplayll {
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    // public static void display(Node head){           //This is iterative method.
    //     Node temp=head;
    //     while(head!=null){
    //         System.out.print(head.data+" ");
    //         head=head.next;
    //     }
    // }


    public static void recursiondsiplay(Node head){                         //This is recersive method.
        if(head==null) return;
       System.out.print(head.data+" ");
       recursiondsiplay(head.next);
    }




    public static void reverse(Node head){
        if(head==null) return;
        reverse(head.next);
        System.out.print(head.data+" ");
    }


    public static int length(Node head){        ///Method to find the length of the list.
        int count =0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }


    public static void main(Stringggg[] args) {
        Node s = new Node(1);
        Node s1 = new Node(2);

        Node s2 = new Node(3);
        Node s3 = new Node(4);
        Node s4 = new Node(5);
        Node s5 = new Node(6);



        s.next=s1;
        s1.next=s2;
        s2.next=s3;
        s3.next=s4;
        s4.next=s5;
        Node temp=s;

        
        //System.out.print("This linked list is: ");
        //display(s);
        // System.out.println("Orioginal: ");
        
        // recursiondsiplay(s);
        // System.out.println();
        // System.out.println("Reversed: ");
        // reverse(s);



       System.out.println(length(s));

        
    }
    
}
