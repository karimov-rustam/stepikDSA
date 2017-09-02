import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by R.Karimov on 9/2/17.
 */
class InversionsTest {
    @Test
    void test01() throws IOException {
        String link = "./src/l07_inversions/input1.txt";
        BufferedReader in = new BufferedReader(new FileReader(link));
        assertEquals(2, new Inversions().run(in));
    }

    @Test
    void test02() throws IOException {
        String link = "./src/l07_inversions/input2.txt";
        BufferedReader in = new BufferedReader(new FileReader(link));
        assertEquals(2506410516L, new Inversions().run(in));
    }

    @Test
    void test03() throws IOException {
        String link = "./src/l07_inversions/input3.txt";
        BufferedReader in = new BufferedReader(new FileReader(link));
        assertEquals(0, new Inversions().run(in));
    }

}