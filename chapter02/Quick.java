public class Quick{


    public static void sort(Comparable[] a){
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int flag  = partition(a, start, end);
        System.out.println("++++++++++");
        show(a);
        System.out.println("++++++++++");
        sort(a, start, flag - 1);
        sort(a, flag + 1, end);
    }

    private static int partition(Comparable[] a, int start, int end) {
        int i = start;
        for (int j = start; j < end; j++) {
            if (less(a[j], a[end])) {
                exch(a, j, i);
                i++;
            }
        }
        exch(a, i, end);
        return i;
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
       //  assert isSorted(a);
        show(a);
    }
}
