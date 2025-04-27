public class RemoveDupiicateFromSortedList {
    public static class Node{
        int val;Node next;
        Node(int val){
            this.val=val;
        }


        public static Node DuplicateRemove(Node head){
            Node temp = head;
            while(temp!=null&&temp.next!=null){
                if(temp.next.val==temp.val){
                    temp.next=temp.next.next;
                }
                if(temp.next==null){
                    return head;
                }
                if(temp.next.val!=temp.val){
                    temp=temp.next;

                }
            }
            return head;
        }
        public static void print(Node head){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(Stringggg[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(3);
        Node f = new Node(4);
        Node g = new Node(4);
        Node h = new Node(5);
        Node i = new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        Node.print(a);
        Node p = Node.DuplicateRemove(a);
        p.print(a);
        
        
    }
    
}
