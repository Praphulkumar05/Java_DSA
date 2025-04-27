public class twoSum {
    public static class Node {
        Node next;
        Node pre;
        int val;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.pre = null;
        }
    }

    public static class Q {
        public Node head;

        // Insert nodes into the list (your original logic)
        public void insert(int val) {
            Node newNode = new Node(val);
            if (head != null) {
                newNode.next = head;
                head.pre = newNode;
            }
            head = newNode;
        }
        public void reverse() {
            Node temp = null;
            Node current = head;

            // Swap next and prev pointers for all nodes
            while (current != null) {
                temp = current.pre;
                current.pre = current.next;
                current.next = temp;
                current = current.pre;
            }

            // Update head to point to the new front
            if (temp != null) {
                head = temp.pre;
            }
        }

        // Two-pointer logic to find if a target sum exists
        public boolean TwoSum(int target) {
            if (head == null) {
                return false; // Empty list
            }

            Node h = head;
            Node t = head;

            // Move `t` to the tail
            while (t.next != null) {
                t = t.next;
            }

            // Two-pointer approach to find the target
            while (h != null && t != null && h.val < t.val) {
                int sum = h.val + t.val;
                if (sum == target) {
                    return true; // Pair found
                } else if (sum > target) {
                    t = t.pre; // Move the tail pointer backward
                } else {
                    h = h.next; // Move the head pointer forward
                }
            }
            return false; // No pair found
        }

        // Display the list without modifying `head`
        public void display() {
            Node temp = head; // Use a temporary pointer to traverse
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q i = new Q();

        // Insert sorted values
        i.insert(3);
        i.insert(5);
        i.insert(8);
        i.insert(13);
        i.insert(100);

        // Display the list
        i.display();

        // Check for a target sum
        int target = 16;
        if (i.TwoSum(target)) {
            System.out.println("Target match");
        } else {
            System.out.println("Target not match");
        }
    }
}
