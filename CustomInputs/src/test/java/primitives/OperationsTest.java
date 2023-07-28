package primitives;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OperationsTest {
    /**
     * Method under test: {@link Operations#add(int, byte, char)}
     */
    @Test
    void testAdd() {
        assertEquals(132, (new Operations()).add(2, (byte) 'A', 'A'));
    }

    /**
     * Method under test: {@link Operations#sum(int, short)}
     */
    @Test
    void testSum() {
        assertEquals(2, (new Operations()).sum(1, (short) 1));
        assertEquals(4, (new Operations()).sum(3, (short) 1));
        assertEquals(1, (new Operations()).sum(0, (short) 1));
        assertEquals(0, (new Operations()).sum(-1, (short) 1));
    }
}

