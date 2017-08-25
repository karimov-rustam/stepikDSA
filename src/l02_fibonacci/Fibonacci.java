package l02_fibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by R.Karimov on 8/25/17.
 */
public class Fibonacci {

    Map<Integer, BigInteger> cache = new HashMap<>();

    int cnt;

    private BigInteger fibonacci(int n) {
        cnt++;
        if (n < 2) {
            return BigInteger.valueOf(n);
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            BigInteger res = fibonacci(n - 1).add(fibonacci(n - 2));
            cache.put(n, res);
            return res;
        }
    }

    private void run(int n) {
        System.out.println(n + ": " + fibonacci(n));
        System.out.println(cnt + " calls");
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new Fibonacci().run(1111);
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }
}
