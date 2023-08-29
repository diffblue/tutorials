import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
    /**
     * Method under test: {@link Sample#sizeOfStudent()}
     */
    @Test
    void testSizeOfStudent() {
        assertEquals(0, (new Sample()).sizeOfStudent());
    }
}

