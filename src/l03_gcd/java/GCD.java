import java.util.Scanner;

/**
 * Created by R.Karimov on 8/28/17.
 */
class GCD {

    private long gcd(long a, long b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a >= b) {
            return gcd(a % b, b);
        } else {
            return gcd(a, b % a);
        }
    }

    long run(long a, long b) {
        return gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        long result = new GCD().run(a, b);
        System.out.println(result);
    }
}
