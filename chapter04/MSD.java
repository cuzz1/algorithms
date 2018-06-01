public class MSD {
    public static void sort(String [] a, int R) {
        String[] aux = new String[N];
        int[] count = new int[R + 1];

        // 计算出现的频率
        for (int i = 0; i < N; i++) {
            count[a[i].key() + 1] ++;
        }
        // 将频率转化为索引
        for (int r = 0; r < R; i++) {
            count[r+1] += count[r];
        }

        // 将元素分类
        for (int i = 0; i < N; i++) {
            aux[count[a[i].key()}] = a[i];
        }
        // 回写
        for (int i = 0; i < N; i++) {
            a[i] = aux[i];
        }
    }
}
