import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by R.Karimov on 9/1/17.
 */
class BinarySearch {

    private void run(Scanner in) throws FileNotFoundException {

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        int[] b = new int[k];
        for (int i = 0; i < k; i++) {
            b[i] = in.nextInt();
        }
        for (int i = 0; i < k; i++) {
//            int pos = linearSearch(a, b[i]);
            int pos = binarySearch(a, b[i]);
            System.out.print(pos + " ");
        }
        System.out.println();
    }

    private int binarySearch(int[] a, int x) {
        int l = -1;
        int r = a.length;
        while (r > l + 1) {
            int m = (l + r) >> 1;
            if (a[m] <= x) {
                l = m;
            } else {
                r = m;
            }
        }
        if (l >= 0 && a[l] == x) {
            return l + 1;
        } else {
            return -1;
        }
    }

    private int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return (i + 1);
        }
        return -1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("./testdata/l06_binary_search/input2.txt"));
//        Scanner in = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        new BinarySearch().run(in);
        long finishTime = System.currentTimeMillis();
//        System.out.println(finishTime - startTime + " ms");
    }
}
