package properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.jupiter.api.Test;

class ResourcesPropsDiffblueTest {
  /**
  * Method under test: {@link ResourcesProps#ResourcesProps(Properties)}
  */
  @Test
  void testConstructor() throws IOException {
    // Arrange
    Properties properties = new Properties();
    try (InputStream inStream = ResourcesProps.class.getResourceAsStream("/Resources.properties")) {
      properties.load(inStream);
    }

    // Act and Assert
    assertEquals("https://app.resources.com/", (new ResourcesProps(properties)).getBaseUri());
  }

  /**
   * Method under test: {@link ResourcesProps#getBaseUri()}
   */
  @Test
  void testGetBaseUri() throws IOException {
    // Arrange
    Properties properties = new Properties();
    try (InputStream inStream = ResourcesProps.class.getResourceAsStream("/Resources.properties")) {
      properties.load(inStream);
    }

    // Act and Assert
    assertEquals("https://app.resources.com/", (new ResourcesProps(properties)).getBaseUri());
  }
}

