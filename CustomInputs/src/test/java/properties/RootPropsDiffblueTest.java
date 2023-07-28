package properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import org.junit.jupiter.api.Test;

class RootPropsDiffblueTest {
  /**
  * Method under test: {@link RootProps#RootProps(Properties)}
  */
  @Test
  void testConstructor() throws IOException {
    // Arrange
    Properties properties = new Properties();
    try (BufferedReader newBufferedReaderResult = Files.newBufferedReader(Paths.get("Root.properties"))) {
      properties.load(newBufferedReaderResult);
    }

    // Act and Assert
    assertEquals("https://app.root.com/", (new RootProps(properties)).getBaseUri());
  }

  /**
   * Method under test: {@link RootProps#getBaseUri()}
   */
  @Test
  void testGetBaseUri() throws IOException {
    // Arrange
    Properties properties = new Properties();
    try (BufferedReader newBufferedReaderResult = Files.newBufferedReader(Paths.get("Root.properties"))) {
      properties.load(newBufferedReaderResult);
    }

    // Act and Assert
    assertEquals("https://app.root.com/", (new RootProps(properties)).getBaseUri());
  }
}

