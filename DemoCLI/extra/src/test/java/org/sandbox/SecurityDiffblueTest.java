package org.sandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SecurityDiffblueTest {
  /**
   * Method under test: {@link Security#getPageSize()}
   */
  @Test
  void testGetPageSize() throws Exception {
    // Arrange, Act and Assert
    assertEquals(4096, (new Security()).getPageSize());
  }

  /**
  * Method under test: default or parameterless constructor of {@link Security}
  */
  @Test
  void testConstructor() throws Exception {
    // Arrange, Act and Assert
    assertEquals(4096, (new Security()).getPageSize());
  }
}

