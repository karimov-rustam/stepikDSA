import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by R.Karimov on 9/2/17.
 */
class Inversions {

    private long count = 0;
    private int[] temp;
    private int[] a;

    private void merge(int l, int m, int r) {
        // a[l .. m - 1] a[m..r - 1] -> temp[l..r - 1] -> a[l..r - 1]
        int i = l;
        int j = m;
        for (int k = l; k < r; k++) {
            if (j == r || (i < m && a[i] <= a[j])) {
                temp[k] = a[i++];
            } else {
                count += m - i;
                temp[k] = a[j++];
            }
        }
        System.arraycopy(temp, l, a, l, r - l);
    }

    private void mergeSort(int l, int r) {
        if (r <= l + 1) return;
        // a[l..r - 1] -> a[l..m - 1] a[m..r - 1]
        int m = (l + r) >> 1;
        mergeSort(l, m);
        mergeSort(m, r);
        merge(l, m, r);
    }

    long run(BufferedReader in) throws IOException {
        int n = Integer.parseInt(in.readLine());
        a = new int[n];
        String[] tokens = in.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tokens[i]);
        }
        temp = new int[n];
        mergeSort(0, n);
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long count = new Inversions().run(in);
        System.out.println(count);
    }
}
