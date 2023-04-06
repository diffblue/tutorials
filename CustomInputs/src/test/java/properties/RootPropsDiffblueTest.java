package properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import org.junit.jupiter.api.Test;

class RootPropsDiffblueTest {

  @Test
  void testConstructor() throws IOException {
    // Arrange
    Properties properties = new Properties();
    try (BufferedReader reader = Files.newBufferedReader(Paths.get("Root.properties"))) {
      properties.load(reader);
    }
    // Act and Assert
    assertEquals("https://app.root.com/", (new RootProps(properties)).getBaseUri());
  }

  @Test
  void testGetBaseUri() throws IOException {
    // Arrange
    Properties properties = new Properties();
    try (BufferedReader reader = Files.newBufferedReader(Paths.get("Root.properties"))) {
      properties.load(reader);
    }
    // Act and Assert
    assertEquals("https://app.root.com/", (new RootProps(properties)).getBaseUri());
  }

}

