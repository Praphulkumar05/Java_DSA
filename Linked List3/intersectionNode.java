public class intersectionNode {
    public static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
        }

        public static  Node getintersection(Node headA, Node headB) {
            Node tempA = headA;
            Node tempB = headB;
            int s1 = 0;
            while (tempA != null) {
                s1++;
                tempA = tempA.next;
            }
            int s2 = 0;
            while (tempB != null) {
                s2++;
                tempB = tempB.next;
            }
            tempA = headA;
            tempB = headB;
            if (s1 > s2) {
                int diff = s1 - s2;
                for (int i = 1; i <= diff; i++) {
                    tempA = tempA.next;
                }
            } else {
                int diff = s2 - s1;
                for (int i = 1; i <= diff; i++) {
                    tempB = tempB.next;
                }
            }
            while (tempA != tempB) {
                tempA = tempA.next;
                tempB = tempB.next;
            }
            return tempA;

        }

       public static  void print(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }

        }

    }

    public static void main(Stringggg[] args) {
        Node a = new Node(87);
        Node b = new Node(100);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(12);
        Node h = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = h;
        a.print(a);



        Node a1 = new Node(90);
        Node b1 = new Node(9);
      


        
        System.out.println();



        a1.next = b1;
        b1.next = d;
       // c1.next = d;
        a1.print(a1);
        System.out.println();


        Node intersect = Node.getintersection(a, a1);
       if(intersect!=null){
        System.out.println("Interset Node is: "+intersect.val);
       }else{
        System.out.println("No intersection happen.");
       }



        

    }

}