package l02_fibonacci;

import java.math.BigInteger;

/**
 * Created by R.Karimov on 8/25/17.
 */
public class Fibonacci {

    private static final int MOD = (int) 1e9 + 7;

    private BigInteger fibonacci(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 0; i < n; i++) {
            BigInteger c = a.add(b);
            // a, b <- b, c
            a = b;
            b = c;
        }
        return a;
    }

    private void run(int n) {
        BigInteger result = fibonacci(n);
        System.out.println(n + ": " + result);
        System.out.println(n + " % MOD: " + result.mod(BigInteger.valueOf(MOD)));
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new Fibonacci().run(111111);
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }
}
