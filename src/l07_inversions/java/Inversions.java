import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by R.Karimov on 9/2/17.
 */
class Inversions {

    private int[] merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int[] res = new int[a.length + b.length];
        for (int k = 0; k < res.length; k++) {
            if (j == b.length || (i < a.length && a[i] < b[j])) {
                res[k] = a[i++];
            } else {
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

    private void run(Scanner in) throws FileNotFoundException {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] sortedA = mergeSort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(sortedA[i]);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("./src/l07_inversions/input2.txt"));
        long startTime = System.currentTimeMillis();
        new Inversions().run(in);
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }
}
