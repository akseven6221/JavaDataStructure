public class BSTree<Key extends  Comparable<Key>, Value> {
    private Node root;

    private class Node {
        private Key key;
        private Value val;
        private Node left, right;
        private int N;

        //必须是带实参的构造方法，不能有无参的默认构造方法，因为这是泛型，可以指定任何类型的...
        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    private void printBSTree(Node root) {
        if (root != null)
            System.out.println("root.key: "+root.key+" Value: "+root.val);
        if (root.left != null) {
            printBSTree(root.left);
        }
        if (root.right != null) {
            printBSTree(root.right);
        }
    }

    public void printPreOrder () {
        System.out.println("preOrder:");
        printBSTree(root);
    }

    public int size () {
        return size(root);
    }

    private int size (Node x) {
        if (x == null)
            return 0;
        else
            return x.N;
    }

    public Value get (Key key) {
        return get (root, key);
    }

    private Value get (Node x, Key key) {
        if (x == null)
            return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            return get(x.left, key);
        else if (cmp > 0)
            return get(x.right, key);
        else
            return x.val;
    }

    public void put(Key key, Value val) {
        root = put (root, key, val);
    }

    private Node put (Node x, Key key, Value val) {
        if (x == null)
            return new Node(key, val, 1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            x.left = put(x.left, key, val);
        else if (cmp > 0)
            x.right = put(x.right, key, val);
        else
            x.val = val;
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    private Node getRoot () {
        return root;
    }

}

