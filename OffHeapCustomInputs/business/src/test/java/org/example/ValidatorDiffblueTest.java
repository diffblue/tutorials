package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.example.core.CoreUtils;
import org.example.model.Message;
import org.example.model.Teacher;
import org.junit.jupiter.api.Test;

class ValidatorDiffblueTest {
  /**
  * Method under test: {@link Validator#validateMessage(Message)}
  */
  @Test
  void testValidateMessage() {
    // Arrange
    Validator validator = new Validator();
    Message msg = mock(Message.class);
    when(msg.getBody()).thenReturn("Body");

    // Act and Assert
    assertFalse(validator.validateMessage(msg));
    verify(msg).getBody();
  }

  /**
   * Method under test: {@link Validator#validateMessage(Message)}
   */
  @Test
  void testValidateMessage2() {
    // Arrange
    Validator validator = new Validator();
    Message msg = mock(Message.class);
    when(msg.getBody()).thenReturn(CoreUtils.createOffheap(Teacher.class));

    // Act and Assert
    assertTrue(validator.validateMessage(msg));
    verify(msg).getBody();
  }
}