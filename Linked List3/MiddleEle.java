public class MiddleEle {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
        public static void print(Node head){
            Node  temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp= temp.next;
            }
            System.out.println();
        }

        public static Node MiddleEvenLeftOne(Node head){
            Node slow = head;
            Node fast = head;
            while(fast.next.next!=null){
                slow = slow.next;
                fast=fast.next.next;
            }
            return slow;

        }


        public static Node MiddleEvenRightOne(Node head){
            Node slow = head;
            Node fast = head;
            while(fast!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;

        }
        public static Node MiddleOdd(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
               
                
            }
            return slow;
        }

    }
    public static void main(Stringggg[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next= b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        a.print(a);
        Node p= a.MiddleEvenRightOne(a);
        System.out.println("Middle Node  RigthOne: "+p.val);

     

        // Node n = a.MiddleOdd(a);
        // System.out.println("Middle Node is : "+n.val);

        


        
    }
    
}
