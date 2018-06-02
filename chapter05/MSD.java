public class MSD {
    private static int R = 256;       // 基数
    private static final int M = 15;  // 小数组的切换阀值
    private static String[] aux;      // 数据分类的辅助函数

    private static int chatAt(String s, int d) {
        if (d < s.length()) {
            return s.chatAt(d);
        }else {
            return -1;
        }
    }

    public static void sort(String[] a) {
        int N = a.length;
        aux = new String[N];
        sort(a, 0, N-1, 0);
    }

    // 以第d个字符为键将a[lo]至a[hi]排序
    private static void sort(String[] a, int lo, int hi, int d) {
        // 当划分的很小的时候使用插入排序
        if (hi < lo + M) {
            Insertion.sort(a, lo, hi, d);
            return;
        }

        // 计算频率
        int[] count = new int[R+2];
        for (int i = lo; i <= hi; i++) {
            count[charAt(a[i], d) + 2] ++;
        }

        // 将频率转化为索引
        for (int r = 0; r < R+1; r++) {
            count[r+1] += count[r];
        }

        // 将数据分类
        for (int i = lo; i <= hi; i++) {
            aux[count[charAt(a[i], d) + 1]++] = a[i];
        }

        // 递归的以每个字符为键进行排序
        for (int r = 0; r < R; r++) {
            sort(a, lo + count[r], lo + count[r+1] - 1, d+1);
        }


    }
}
