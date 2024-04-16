public class MyBinarySearchTree {

    Node root;

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    public Node insertRecursive(Node root, int data) {
        if (root == null)
            root = new Node(data);
        else if (data < root.getData())
            root.setLeft(insertRecursive(root.getLeft(), data));
        else
            root.setRight(insertRecursive(root.getRight(), data));
        return root;
    }

    public void showInOrder() {
        if (root == null)
            System.out.println("Tree is empty");
        else
            inOrderRecursive(root);

    }

    private void inOrderRecursive(Node root) {
        if (root != null) {
            inOrderRecursive(root.getLeft());
            System.out.print(root.getData() + " ");
            inOrderRecursive(root.getRight());
        }
    }

}
