public class LSD{
    public static void sort(String[] a, int W) {
        // 通过前W个字符将a[]排序
        int N = a.length;
        int R = 256;
        String[] aux = new String[N];

        for (int d = W-1; d >= 0; d--) {
            // 根据第d个字符用键索引计数法排序
            int[] count = new int[R+1];
            // 计算出现的频率
            for (int i = 0; i < N; i++) {
                count[a[i].chatAt(d) + 1]++;
            }
            // 将频率转化为索引
            for (int r = 0; r < R; r++) {
                count[r+1] += count[r];
            }
            // 将元素分类
            for (int i = 0; i < N; i++) {
                aux[count[a[i].charAt(d)]++] = a[i];
            }

            // 回写
            for (int i = 0; i < N; i++) {
                a[i] = aux[i];
            }
        }
    }
}
