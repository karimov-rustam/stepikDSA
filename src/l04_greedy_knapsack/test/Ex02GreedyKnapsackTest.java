import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by R.Karimov on 8/29/17.
 */
class Ex02GreedyKnapsackTest {

    @Test
    void test1() throws FileNotFoundException {
        Scanner input = new Scanner(new File("testdata/l04_greedy_knapsack/input1.txt"));
        int n = input.nextInt();
        int w = input.nextInt();
        Ex02GreedyKnapsack.Item[] items = new Ex02GreedyKnapsack.Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Ex02GreedyKnapsack.Item(
                    input.nextInt(), input.nextInt());
        }
        Arrays.sort(items);
        double result = new Ex02GreedyKnapsack().run(w, items);
        assertEquals(180L, result);
    }

    @Test
    void test2() throws FileNotFoundException {
        Scanner input = new Scanner(new File("testdata/l04_greedy_knapsack/input2.txt"));
        int n = input.nextInt();
        int w = input.nextInt();
        Ex02GreedyKnapsack.Item[] items = new Ex02GreedyKnapsack.Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Ex02GreedyKnapsack.Item(
                    input.nextInt(), input.nextInt());
        }
        Arrays.sort(items);
        double result = new Ex02GreedyKnapsack().run(w, items);
        assertEquals(5L, result);
    }

}