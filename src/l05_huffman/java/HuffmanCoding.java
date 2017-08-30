import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by R.Karimov on 8/30/17.
 */
class HuffmanCoding {
    class Node implements Comparable<Node> {
        final int sum;
        String code;

        void buildCode(String code) {
            this.code = code;
        }

        Node(int sum) {
            this.sum = sum;
        }

        @Override
        public int compareTo(Node node) {
            return Integer.compare(sum, node.sum);
        }
    }

    class InternalNode extends Node {
        Node left;
        Node right;

        @Override
        void buildCode(String code) {
            super.buildCode(code);
            left.buildCode(code + "0");
            right.buildCode(code + "1");
        }

        InternalNode(Node left, Node right) {
            super(left.sum + right.sum);
            this.left = left;
            this.right = right;
        }
    }

    class LeafNode extends Node {
        char symbol;

        @Override
        void buildCode(String code) {
            super.buildCode(code);
            System.out.println(symbol + ": " + code);
        }

        LeafNode(char symbol, int count) {
            super(count);
            this.symbol = symbol;
        }
    }

    void run(String string) throws FileNotFoundException {

        Map<Character, Integer> count = getCharacterIntegerMap(string);

        Map<Character, Node> characterNodeMap = new HashMap<>();
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            LeafNode node = new LeafNode(entry.getKey(), entry.getValue());
            characterNodeMap.put(entry.getKey(), node);
            priorityQueue.add(node);
        }

        int sum = 0;
        while (priorityQueue.size() > 1) {
            Node first = priorityQueue.poll();
            Node second = priorityQueue.poll();
            InternalNode node = new InternalNode(first, second);
            sum += node.sum;
            priorityQueue.add(node);
        }

        if (count.size() == 1) {
            sum = string.length();
        }

        System.out.println(count.size() + " " + sum);
        Node root = priorityQueue.poll();

        if (count.size() == 1) {
            root.buildCode("0");
        } else {
            root.buildCode("");
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            stringBuilder.append(characterNodeMap.get(c).code);
        }
        System.out.println(stringBuilder);
    }

    private Map<Character, Integer> getCharacterIntegerMap(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }
        return count;
    }


    public static void main(String[] args) throws FileNotFoundException {
//        Scanner in = new Scanner(
//                new File("./testdata/l05_huffman/big_input.txt"));
        Scanner in = new Scanner(System.in);
        String string = in.next();
        long startTime = System.currentTimeMillis();
        new HuffmanCoding().run(string);
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }
}
