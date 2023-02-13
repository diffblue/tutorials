package properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import org.junit.jupiter.api.Test;

class ExampleAppDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link ExampleApp#ExampleApp(Properties)}
  *   <li>{@link ExampleApp#getBaseUri()}
  * </ul>
  */
  @Test
  void testConstructor() throws IOException {
    // Arrange
    Properties properties = new Properties();
    try (BufferedReader newBufferedReaderResult = Files.newBufferedReader(Paths.get("MyProps.properties"))) {
      properties.load(newBufferedReaderResult);
    }

    // Act and Assert
    URI baseUri = (new ExampleApp(properties)).getBaseUri();
    assertEquals("app.example.com", baseUri.getAuthority());
    URL toURLResult = baseUri.toURL();
    assertSame(baseUri, baseUri.normalize());
    assertNull(baseUri.getFragment());
    assertEquals("/", baseUri.getPath());
    assertNull(baseUri.getRawFragment());
    assertTrue(baseUri.isAbsolute());
    assertFalse(baseUri.isOpaque());
    assertEquals("/", baseUri.getRawPath());
    assertEquals(-1, baseUri.getPort());
    assertNull(baseUri.getRawQuery());
    assertEquals("//app.example.com/", baseUri.getRawSchemeSpecificPart());
    assertEquals("app.example.com", baseUri.getHost());
    assertNull(baseUri.getQuery());
    assertNull(baseUri.getRawUserInfo());
    assertEquals("https", baseUri.getScheme());
    assertNull(baseUri.getUserInfo());
    assertEquals("app.example.com", baseUri.getRawAuthority());
    assertEquals("//app.example.com/", baseUri.getSchemeSpecificPart());
    assertEquals(443, toURLResult.getDefaultPort());
    assertEquals("/", toURLResult.getPath());
    assertEquals(-1, toURLResult.getPort());
    assertNull(toURLResult.getQuery());
    assertNull(toURLResult.getRef());
    assertEquals("https://app.example.com/", toURLResult.toExternalForm());
    assertNull(toURLResult.getUserInfo());
    assertEquals("app.example.com", toURLResult.getHost());
    assertEquals("https", toURLResult.getProtocol());
    assertEquals("app.example.com", toURLResult.getAuthority());
    assertEquals("/", toURLResult.getFile());
  }

  /**
   * Method under test: {@link ExampleApp#ExampleApp(Properties)}
   */
  @Test
  void testConstructor2() throws IOException {
    // Arrange
    Properties properties = new Properties();
    try (BufferedReader newBufferedReaderResult = Files.newBufferedReader(Paths.get("MyProps.properties"))) {
      properties.load(newBufferedReaderResult);
    }

    // Act
    new ExampleApp(properties);

    // Assert
    assertEquals(1, properties.size());
  }
}

