import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by R.Karimov on 8/30/17.
 */
class GenerateBinarySearchInput {
    public static void main(String[] args) throws FileNotFoundException {
        new GenerateBinarySearchInput().run();
    }

    private void run() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(
                "./testdata/l06_binary_search/input.txt");
        int n = 100000;
        int k = 100000;
        Random random = new Random();
        int[] a = new int[n];
        int[] b = new int[k];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(1000_000_000);
        }
        Arrays.sort(a);
        for (int i = 0; i < k; i++) {
            b[i] = a[random.nextInt(n)];
        }

        printWriter.print(n);
        for (int i = 0; i < n; i++) {
            printWriter.print(" " + a[i]);
        }
        printWriter.println();

        printWriter.print(k);
        for (int i = 0; i < k; i++) {
            printWriter.print(" " + b[i]);
        }
        printWriter.println();

        printWriter.close();
    }
}
