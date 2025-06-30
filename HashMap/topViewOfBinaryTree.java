import java.util.*;

public class topViewOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class Pair {
        TreeNode node;
        int hd;

        Pair(TreeNode node, int hd) {
            this.hd = hd;
            this.node = node;
        }
    }

    public List<Integer> topView(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();//pair
        queue.add(new Pair(root, 0));   //adding the first in the queue.

        while (!queue.isEmpty()) {
            Pair curr = queue.poll(); // making the pair of node and the horizontal dist/ and  taking the control of first element of the queue using queue.poll()..
            TreeNode node = curr.node;
            int hd = curr.hd;// help to find the treeNode and the horizontal distance

            if (!map.containsKey(hd)) {
                map.put(hd, node.val);
            } // putting the TreeNode/value/data and the hd in the map

            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));  //decrease the hd
            }
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));//increase the hd.
            }

        }
        return new ArrayList<>(map.values());
    }

    public TreeNode buildTree() {    //making the tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        return root;

    }

    public static void main(String[] args) {
        topViewOfBinaryTree obj = new topViewOfBinaryTree();
        TreeNode root = obj.buildTree();
        List<Integer> result = obj.topView(root);  //putting the root into the arraylist..
        System.out.println("Top View should be like this: ");
        for (int val : result) {
            System.out.print(val + " ");

        }



        //38 min of part ->3




    }

}
