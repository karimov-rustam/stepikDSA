package l02_fibonacci;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by R.Karimov on 8/26/17.
 */
class Ex03FibonacciTest {
    private Ex03Fibonacci ex03;

    @BeforeEach
    public void setup(){
        ex03 = new Ex03Fibonacci();
    }

    @Test
    void run2() {
        BigInteger n = new BigInteger("10");
        BigInteger m = new BigInteger("10");
        BigInteger expect = new BigInteger("10");
        assertEquals(expect, ex03.run2(n, m));
    }

    @Test
    public void test01() {
        long n = 10;
        int m = 2;
        Long res = 10l;
        assertEquals(res, ex03.run(n, m, Long.class));
    }

    @Test
    public void test02() {
        BigInteger n = new BigInteger("60282445765134413");
        int m = 2263;
        BigInteger expect = new BigInteger("974");
        assertEquals(974, ex03.run(n, m, BigInteger.class));
    }

}