import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by R.Karimov on 8/25/17.
 */
class Ex03Fibonacci {

    private static List<Long> getSequence(long m) {
        List<Long> seq = new ArrayList<>();
        seq.add(0L);
        seq.add(1L);
        for (int i = 2; i < 6 * m; i++) {
            seq.add((seq.get(i - 1) + seq.get(i - 2)) % m);
            if (seq.get(i) == 1 && seq.get(i - 1) == 0) {
                break;
            }
        }
        return seq;
    }

    static long run(BigInteger n, long m) {
        List<Long> seq = getSequence(m);
        long period = seq.size() - 2;
        int index = n.mod(BigInteger.valueOf(period)).intValue();
        return seq.get(index);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger n = s.nextBigInteger();
        long m = s.nextLong();
        System.out.println(Ex03Fibonacci.run(n, m));
    }
}