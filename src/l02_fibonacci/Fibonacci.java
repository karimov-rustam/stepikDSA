package l02_fibonacci;

/**
 * Created by R.Karimov on 8/25/17.
 */
public class Fibonacci {

    private int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private void run(int n) {
        System.out.println(n + ": " + fibonacci(n));

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            long startTime = System.currentTimeMillis();
            new Fibonacci().run(i);
            long finishTime = System.currentTimeMillis();
            System.out.println(finishTime - startTime + " ms");
        }
    }
}
