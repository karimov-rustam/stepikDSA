import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by R.Karimov on 8/26/17.
 */
class Ex03FibonacciTest {

    @Test
    void test01() {
        BigInteger n = new BigInteger("10");
        long m = 2;
        long expect = 1L;
        assertEquals(expect, Ex03Fibonacci.run(n, m));
    }

    @Test
    void test02() {
        BigInteger n = new BigInteger("60282445765134413");
        long m = 2263;
        long expect = 974L;
        assertEquals(expect, Ex03Fibonacci.run(n, m));
    }

}