import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by R.Karimov on 8/29/17.
 */
class Ex01GreedyLine {

    static class Line implements Comparable<Line> {
        private int left;
        private int right;

        Line(int left, int right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "Line{" +
                    "l=" + left +
                    ", r=" + right +
                    '}';
        }

        @Override
        public int compareTo(Line line) {
            return Integer.compare(right, line.right);
        }
    }

    List<Integer> run(Line[] lines) {
        List<Integer> result = new ArrayList<>();
        int point = lines[0].right;
        result.add(point);

        for (Line line: lines) {
            if (point < line.left) {
                result.add(line.right);
                point = line.right;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        Line[] lines = new Line[count];
        for (int i = 0; i < count; i++) {
            lines[i] = new Line(in.nextInt(), in.nextInt());
        }
        Arrays.sort(lines);
        List<Integer> result = new Ex01GreedyLine().run(lines);
        System.out.println(result.size());

        for (Integer item: result) {
            System.out.println(item);
        }
    }
}