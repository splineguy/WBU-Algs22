import edu.princeton.cs.algs4.StdOut;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(0);
        bt.root.left = new Node(1);
        bt.root.right = new Node(2);
        bt.root.left.left = new Node(3);
        bt.root.left.right = new Node(4);

        StdOut.print("InOrder: ");
        printInOrder(bt.root);
        StdOut.print("PreOrder: ");
        printPreOrder(bt.root);
        StdOut.print("PostOrder: ");
        printPostOrder(bt.root);
        StdOut.print("LevelOrder: ");
        printLevelOrder(bt.root);
    }

    public static void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);

        StdOut.print(node.item + " ");

        printInOrder(node.right);
    }

    public static void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
        StdOut.print(node.item + " ");

        printPreOrder(node.left);

        printPreOrder(node.right);
    }

    public static void printPostOrder(Node node) {
        if (node == null) {
            return;
        }
        printPostOrder(node.left);

        printPostOrder(node.right);

        StdOut.print(node.item + " ");
    }

    public static void printLevelOrder(Node root) {
        
    }
}
