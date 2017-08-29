import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by R.Karimov on 8/29/17.
 */
class Ex03GreedyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int value = n;

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (value - i <= i) {
                result.add(value);
                break;
            } else {
                result.add(i);
                value -= i;
            }
        }
        System.out.println(result.size());
        for (Integer res: result) {
            System.out.println(res);
        }
    }
}
