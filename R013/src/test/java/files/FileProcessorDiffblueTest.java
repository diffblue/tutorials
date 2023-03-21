package files;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class FileProcessorDiffblueTest {
  /**
  * Method under test: {@link FileProcessor#commentLines(List)}
  */
  @Test
  void testCommentLines() {
    // Arrange, Act and Assert
    assertTrue(FileProcessor.commentLines(new ArrayList<>()).isEmpty());
  }

  /**
   * Method under test: {@link FileProcessor#commentLines(List)}
   */
  @Test
  void testCommentLines2() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("foo");

    // Act and Assert
    assertTrue(FileProcessor.commentLines(stringList).isEmpty());
  }

  /**
   * Method under test: {@link FileProcessor#commentLines(List)}
   */
  @Test
  void testCommentLines3() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("foo");
    stringList.add("foo");

    // Act and Assert
    assertTrue(FileProcessor.commentLines(stringList).isEmpty());
  }

  /**
   * Method under test: {@link FileProcessor#commentLines(List)}
   */
  @Test
  void testCommentLines4() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("#");

    // Act
    List<String> actualCommentLinesResult = FileProcessor.commentLines(stringList);

    // Assert
    assertEquals(1, actualCommentLinesResult.size());
    assertEquals("#", actualCommentLinesResult.get(0));
  }

  /**
   * Method under test: {@link FileProcessor#readFile(File)}
   */
  @Test
  void testReadFile() throws IOException {
    // Arrange and Act
    List<String> actualReadFileResult = FileProcessor
            .readFile(FileFactory.loadFile("input.txt"));

    // Assert
    assertEquals(2, actualReadFileResult.size());
    assertEquals("# a b c", actualReadFileResult.get(0));
    assertEquals("# 1 2 3", actualReadFileResult.get(1));
  }

  /**
   * Method under test: {@link FileProcessor#readAnotherFile(File)}
   */
  @Test
  void testReadAnotherFile() throws IOException {
    // Arrange and Act
    List<String> actualReadAnotherFileResult = FileProcessor
            .readAnotherFile(FileFactory.loadFile("another_input.txt"));

    // Assert
    assertEquals(2, actualReadAnotherFileResult.size());
    assertEquals("# m p q", actualReadAnotherFileResult.get(0));
    assertEquals("# 9 6 2", actualReadAnotherFileResult.get(1));
  }
}