import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by R.Karimov on 9/2/17.
 */
class Inversions {

    private long count = 0;
    private int[] merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int[] res = new int[a.length + b.length];
        for (int k = 0; k < res.length; k++) {
            if (j == b.length || (i < a.length && a[i] <= b[j])) {
                res[k] = a[i++];
            } else {
                count += a.length - i;
                res[k] = b[j++];
            }
        }
        return res;
    }
    private int[] mergeSort(int[] a) {
        if (a.length == 1) return a;
        int n = a.length;
        int m = n / 2;
        int[] left = new int[m];
        int[] right = new int[n - m];
        System.arraycopy(a, 0, left, 0, m);
        System.arraycopy(a, m, right, 0, n - m);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    long run(BufferedReader in) throws IOException {
        int n = Integer.parseInt(in.readLine());
        int[] a = new int[n];
        String[] tokens = in.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tokens[i]);
        }
        int[] sortedA = mergeSort(a);
        return count;
//        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long count = new Inversions().run(in);
        System.out.println(count);
    }
}
