public class TrieST<Value> {
    private static int R = 256; // 基数
    private Node root;          // 单词查找的根节点

    private static class Node {
        private Object val;
        private Node[] next = new Node[R];
    }

    public void put(String key, value val) {
        root = put(root, key, val, 0);
    }

    private Node put(Node x, String key, Value val, int d) {
        // 如果key存在于以x为根节点的子单词查找树中则更新与它相关联的值
        if (x == null) {
            x = new Node();
        }

        if (d == key.length()) {
            x.val = val;
            return x;
        }
        // 找到第d个字符所对应的子单词查找树
        char c = key.charAt(d);
        x.next[c] = put(x.next[c], key, val, d+1);
        return x;
    }
}
