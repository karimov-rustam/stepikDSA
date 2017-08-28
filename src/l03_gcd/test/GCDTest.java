import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by R.Karimov on 8/28/17.
 */
class GCDTest {

    @Test
    void test01() {
        assertEquals(1L, new GCD().run(18L, 35L));
    }

    @Test
    void test02() {
        assertEquals(4, new GCD().run(14159572, 63967072));
    }

}