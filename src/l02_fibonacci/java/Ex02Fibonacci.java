import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by R.Karimov on 8/25/17.
 */
class Ex02Fibonacci {

    private BigInteger fibonacci(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 0; i < n; i++) {
            BigInteger c = (a.add(b)).mod(BigInteger.valueOf(10));
            // a, b <- b, c
            a = b;
            b = c;
        }
        return a;
    }

    private void run(int n) {
        BigInteger result = fibonacci(n);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        new Ex02Fibonacci().run(a);
    }
}
