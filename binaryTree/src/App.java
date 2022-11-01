public class App {
    public static void main(String[] args) throws Exception {
        Tree binaryTree = new Tree();
        binaryTree.start = new Node(8);

        binaryTree.start.left = new Node(3);
        binaryTree.start.left.left = new Node(1);
        binaryTree.start.left.right = new Node(6);
        binaryTree.start.left.right.left = new Node(4);
        binaryTree.start.left.right.right = new Node(7);

        binaryTree.start.right = new Node(10);
        binaryTree.start.right.right = new Node(14);
        binaryTree.start.right.right.left = new Node(13);

        System.out.println("\n\nInOrder");
        printInorder(binaryTree.start);
        System.out.println("\n\nPreOrder");
        printPreorder(binaryTree.start);
        System.out.println("\n\nPostOrder");
        printPostorder(binaryTree.start);
        System.out.println("\n\n");
    }

    public static void printPreorder(Node node)
    {
        if (node == null){
            return;
        }
        System.out.print(node.value + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public static void printInorder(Node node)
    {
        if (node == null){
            return;
        }
        printInorder(node.left);
        System.out.print(node.value + " ");
        printInorder(node.right);
    }

    public static void printPostorder(Node node)
    {
        if (node == null){
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.value + " ");
    }
}
