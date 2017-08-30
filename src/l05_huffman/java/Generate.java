import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by R.Karimov on 8/30/17.
 */
class Generate {
    public static void main(String[] args) throws FileNotFoundException {
        new Generate().run();
    }

    private void run() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(
                "./testdata/l05_huffman/big_input.txt");
        int n = 10000;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            printWriter.print((char) ('a' + random.nextInt(26)));
        }
        printWriter.close();
    }
}
