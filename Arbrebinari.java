class Node <T> {
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