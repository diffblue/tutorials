package logic;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;
public class BoardTest {

    @Test
    void testCheckLineAsTrue() {
        // Arrange
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "\u00D7");
        map.put(4, "\u00D7");
        map.put(8, "\u00D7");
        Board b = new Board(map);
        // Act // 1st diagonal
        boolean flag = b.checkLine(new int[]{0, 4, 8});
        // Assert
        assertTrue(flag);
    }

    @Test
    void testCheckLineAsFalse() {
        // Arrange
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "\u00D7");
        map.put(4, "\u00D7");
        map.put(8, "\u00D7");
        Board b = new Board(map);
        // Act // 2nd diagonal
        boolean flag = b.checkLine(new int[]{2, 4, 6});
        // Assert
        assertFalse(flag);
    }
}