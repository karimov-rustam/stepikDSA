import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by R.Karimov on 8/29/17.
 */
class Ex01GreedyLineTest {
    @Test
    void test01() throws FileNotFoundException {

        Scanner in = new Scanner(new File(
                "testdata/l04_greedy_knapsack/ex01GreedyLine1.txt"));

        int count = in.nextInt();
        Ex01GreedyLine.Line[] lines = new Ex01GreedyLine.Line[count];

        for (int i = 0; i < count; i++) {
            lines[i] = new Ex01GreedyLine.Line(in.nextInt(), in.nextInt());
        }

        Arrays.sort(lines);
        List<Integer> result = new Ex01GreedyLine().run(lines);
        List<Integer> expect = Arrays.asList(3);

        assertEquals(expect, result);
    }

    @Test
    void test02() throws FileNotFoundException {

        Scanner in = new Scanner(new File(
                "testdata/l04_greedy_knapsack/ex01GreedyLine2.txt"));

        int count = in.nextInt();
        Ex01GreedyLine.Line[] lines = new Ex01GreedyLine.Line[count];

        for (int i = 0; i < count; i++) {
            lines[i] = new Ex01GreedyLine.Line(in.nextInt(), in.nextInt());
        }

        Arrays.sort(lines);
        List<Integer> result = new Ex01GreedyLine().run(lines);
        List<Integer> expect = Arrays.asList(3, 6);

        assertEquals(expect, result);
    }

}