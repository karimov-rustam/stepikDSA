import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by R.Karimov on 8/29/17.
 */
class GreedyKnapsack {

    static class Item implements Comparable<Item> {
        int cost;
        int weight;

        Item(int cost, int weight) {
            this.cost = cost;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "cost=" + cost +
                    ", weight=" + weight +
                    '}';
        }

        @Override
        public int compareTo(Item item) {
            long r1 = (long) cost * item.weight;
            long r2 = (long) item.cost * weight;
            return -Long.compare(r1, r2);
        }
    }

    double run(int w, Item[] items) {
        double result = 0;
        for (Item item : items) {
            if (item.weight <= w) {
                result += item.cost;
                w -= item.weight;
            } else {
                result += (double) item.cost * w / item.weight;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int w = input.nextInt();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(input.nextInt(), input.nextInt());
        }
        Arrays.sort(items);
        System.out.println(new GreedyKnapsack().run(w, items));
    }
}
