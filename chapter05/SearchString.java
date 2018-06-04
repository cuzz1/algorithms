public class SearchString {
    public static void main(String[] args) {
        String pat = "abc";
        String txt = "abababc";
        int result = search(pat, txt);
        System.out.println(result);
    }

    public static int search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++) {
                if (txt.charAt(i+j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == M) {
                return i;
            }
        }
        return -1;
    }
}
