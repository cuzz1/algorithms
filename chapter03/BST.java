public class BST<Key extends Comparable<Key>, Value> {
    private Node root;   // the root of binary search tree

    private class Node {
        private Key key;
        private Value val;
        private Node left, right;

        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node root) {
        if ( x == null ) {
            return 0;
        } else {
            return N;
        }
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            return get(x.left, key);
        } else if (cmp > 0){
            return get(x.right, key)
        } else{
            return x.val;
        }
    }

    // search key, if key exit, update the key, else add this key
    public void put(Key key, Value value) {
        root = put(root, key, value)
    }

    private void put(Node x, Key key, Value value) {
        if (x == null) {
            return new Node(key, val, 1);
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, val);
        } else if (cmp > 0) {
            x.right = put(x.right, key ,val);
        } else {
            x.val = val;
        }
        x.N = size(x.left) + size(x.right) + 1;
        retur x;
    }
}
