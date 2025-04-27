

public class nthNodeEnd {
    public static Node nth(Node head,int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int m = size-n+1;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;

    }
    public static  Node nth1(Node head,int n){
        Node slw = head;
        Node fst=head;
        for(int i=1;i<=n;i++){
            fst=fst.next;
        }
        while(fst!=null){
            fst=fst.next;
            slw=slw.next;
        }
        return slw;
    }


    public static  Node nth2(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
           
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    
    }
    public static void display(Node head){
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }


    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }
    public static void main(Stringggg[] args) {
        Node a = new Node(100); 
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);          
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
       // Node a1 = nth(a, 1);
        Node a2 = nth1(a, 1);
       a=nth2(a, 5);
       display(a);
       // System.out.println(a.val);
        // System.out.println(a2.val);
        // while(a!=null){
        //  a=a.next;
        //  System.out.println(a.val);

            
        // }

      

        
        
    }
    
}
