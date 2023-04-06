package files;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class FileProcessorDiffblueTest {
  @Test
  void testCommentLines() {
    // Arrange, Act and Assert
    assertTrue(FileProcessor.commentLines(new ArrayList<>()).isEmpty());
  }

  @Test
  void testCommentLines2() {
    // Arrange
    ArrayList<String> strings = new ArrayList<>();
    strings.add("foo");
    // Act and Assert
    assertTrue(FileProcessor.commentLines(strings).isEmpty());
  }

  @Test
  void testCommentLines3() {
    // Arrange
    ArrayList<String> strings = new ArrayList<>();
    strings.add("foo");
    strings.add("foo");
    // Act and Assert
    assertTrue(FileProcessor.commentLines(strings).isEmpty());
  }

  @Test
  void testCommentLines4() {
    // Arrange
    ArrayList<String> strings = new ArrayList<>();
    strings.add("#");
    // Act
    List<String> actualCommentLinesResult = FileProcessor.commentLines(strings);
    // Assert
    assertEquals(1, actualCommentLinesResult.size());
    assertEquals("#", actualCommentLinesResult.get(0));
  }

  @Test
  void testReadFile() throws IOException {
    // Arrange and Act
    List<String> actualReadFileResult = FileProcessor.readFile(FileFactory.load("input.txt"));
    // Assert
    assertEquals(2, actualReadFileResult.size());
    assertEquals("# a b c", actualReadFileResult.get(0));
    assertEquals("# 1 2 3", actualReadFileResult.get(1));
  }
}