class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;
    int maxDepth;

    Node(T value, int maxDepth) {
        this.value = value;
        this.maxDepth =maxDepth;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree<T> {
    private Node<T> root;
    private static int instanceCount = 0;

    BinaryTree() {
        this.root = null;
        instanceCount++;
    }

    void insert(T value, int maxDepth) {
        root = insertRecursive(root, value, maxDepth);
    }

    private Node<T> insertRecursive(Node<T> current, T value, int maxDepth) {
        if (current == null) {
            return new Node<>(value, maxDepth);
        }

        if (current.left == null) {
            current.left = insertRecursive(current.right, value, maxDepth - 1);
        } else if (current.right == null) {
            current.right = insertRecursive(current.right, value, maxDepth - 1);
        }

        return current;
    }

    void printRightBranch(Node<T>node) {
        if (node !=null) {
            System.out.println(node.value);
            printRightBranch(node.right);
        }
    }

    
}
