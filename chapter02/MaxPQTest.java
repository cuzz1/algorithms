public class MaxPQTest{
    public static void main(String[] args) {
        MaxPQ<Integer> pq = new MaxPQ<Integer>(4);
        pq.insert(1);
        pq.insert(11);
        pq.insert(111);
        pq.insert(1111);
        System.out.println(pq.delMax());
        System.out.println(pq.delMax());
        System.out.println(pq.delMax());
        System.out.println(pq.delMax());

        String[] strArr = {"A", "C", "R", "W"};
        MaxPQ<String> strPQ = new MaxPQ<String>(strArr);
        while (!strPQ.isEmpty()) {
            System.out.print(strPQ.delMax() + " ");
        }
        System.out.println();
    }
}
