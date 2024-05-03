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

    void printLeftBranch(Node<T> node) {
        if (node != null) {
            System.out.println(node.value);
            printLeftBranch(node.left);
        }
    }

    static int getInstanceCount() {
        return instanceCount;
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer>intTree1 = new BinaryTree<>();
        intTree1.insert(1, 5);

        BinaryTree<Integer>intTree2 = new BinaryTree<>();
        intTree2.insert(1, 5);

        System.out.println("Cantidad de instancias de árboles: " + BinaryTree.getInstanceCount());

        BinaryTree<Character>charTree1 = new BinaryTree<>();
        charTree1.insert('A', 3);

        BinaryTree<Character> charTree2 = new BinaryTree<>();
        charTree2.insert('A', 3);

        System.out.println("Cantidad de instancias de árboles: " + BinaryTree.getInstanceCount());
    }
}
