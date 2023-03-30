package mocking;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;

class BlackBoxSafetyDiffblueTest {
  /**
  * Method under test: {@link BlackBoxSafety#isSafe(BlackBox)}
  */
  @Test
  void testIsSafe() {
    // Arrange
    BlackBox blackBox = mock(BlackBox.class);
    when(blackBox.getSafetyLevel()).thenReturn("Safety Level");

    // Act and Assert
    assertFalse(BlackBoxSafety.isSafe(blackBox));
    verify(blackBox).getSafetyLevel();
  }

  /**
   * Method under test: {@link BlackBoxSafety#isSafe(BlackBox)}
   */
  @Test
  void testIsSafe2() {
    // Arrange
    BlackBox blackBox = mock(BlackBox.class);
    when(blackBox.getSafetyLevel()).thenReturn("SAFE");

    // Act and Assert
    assertTrue(BlackBoxSafety.isSafe(blackBox));
    verify(blackBox).getSafetyLevel();
  }
}

