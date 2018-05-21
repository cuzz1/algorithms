public class Shell{

    public static void sort(Comparable[] a){
        int N = a.length;
        int h = N / 3 ;
        while (h >= 1) {
            for (int i = h; i < N; i++){
                for (int j = i; j >= h ; j-=h) {
                    if (less(a[j], a[j-h])) {
                        exch(a, j-h, j);
                    }
                }
            }
            h /= 3;
        }
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    // print array
    private static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // test order
    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] a = {2, 1, 7, 6, 8, 9, 0, 3, 5, 4};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
