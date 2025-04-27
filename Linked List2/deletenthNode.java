public class deletenthNode {
    public static Node deletenth(Node head,int idx){
        Node fast=head;
        Node slow=head;
      

        for(int i=1;i<=idx;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next; 
            

        }
      
        return slow;
    }
    public static Node removethatNode(Node head,int n){
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
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            

        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
      
    }

    public static void main(Stringggg[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        //1->2->3->4->5->6;
    // Node p= deletenth(a, 6);
   
    // System.out.println(p.data);
    print(a);
   a=removethatNode(a, 1);
   print(a);
    


        
    }
    
}
