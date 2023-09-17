package org.extra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class SeasonDiffblueTest {
  /**
  * Method under test: {@link Season#getItem(String)}
  */
  @Test
  void testGetItem() {
    // Arrange, Act and Assert
    assertNull(Season.WINTER.getItem("foo"));
    assertEquals(Season.FALL, Season.WINTER.getItem("FALL"));
  }

  /**
   * Method under test: {@link Season#getOrder(Season)}
   */
  @Test
  void testGetOrder() {
    // Arrange, Act and Assert
    assertEquals(0, Season.WINTER.getOrder(Season.WINTER));
  }

  /**
   * Method under test: {@link Season#getValue(Season)}
   */
  @Test
  void testGetValue() {
    // Arrange, Act and Assert
    assertEquals("WINTER", Season.WINTER.getValue(Season.WINTER));
  }
}

