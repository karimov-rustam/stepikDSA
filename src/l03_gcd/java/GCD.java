/**
 * Created by R.Karimov on 8/28/17.
 */
class GCD {

    private int gcd(int a, int b) {
        int result = 0;
        for (int i = 1; i < Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }
    private void run() {
        System.out.println(gcd(1141111222, 541111111));
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new GCD().run();
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }
}
