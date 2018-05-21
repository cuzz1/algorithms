public class Merge{

    private static Comparable[] aux;

    public static void sort(Comparable[] a){
        aux  = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        sort(a, start, mid);
        sort(a, mid + 1, end);
        merge(a, start, mid, end);
    }

    private static void merge(Comparable[] a, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        for (int k = start; k <= end; k++) {
            aux[k] = a[k];
        }

        for (int k = start; k <= end; k++) {
            if (i > mid) {
                a[k] = aux[j];
                j++;
            } else if (j > end) {
                a[k] = aux[i];
                i++;
            } else if (less(aux[i], aux[j])) {
                a[k] = aux[i];
                i++;
            } else {
                a[k] = aux[j];
                j++;
            }
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
        Integer[] a = {2, 1, 7, 6, 8, 9, 0, 3, 5,4};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
