import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by R.Karimov on 8/31/17.
 */
class PriorityQueMax {
    void run(Scanner in) {
        int count = in.nextInt();
        String line;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < count; i++) {
            line = in.next();
            switch (line) {
                case "Insert":
                    int value = in.nextInt();
                    priorityQueue.add(value);
                    break;
                case "ExtractMax":
                    System.out.println(priorityQueue.poll());
                    break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        new PriorityQueMax().run(in);
    }
}
