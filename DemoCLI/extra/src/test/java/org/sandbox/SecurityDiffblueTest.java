package org.sandbox;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SecurityDiffblueTest {
  /**
   * Method under test: {@link Security#getPageSize()}
   */
  @Test
  @Disabled("TODO: Complete this test")
  void testGetPageSize() throws Exception {
    // TODO: Complete this test.
    //   Reason: R011 Sandboxing policy violation.
    //   Diffblue Cover ran code in your project that tried
    //     to access 'sun.misc'.
    //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
    //   your code from damaging your system environment.
    //   See https://diff.blue/R011 to resolve this issue.

    // Arrange and Act
    (new Security()).getPageSize();
  }

  /**
  * Method under test: default or parameterless constructor of {@link Security}
  */
  @Test
  void testConstructor() {
    // TODO: Complete this test.
    //   Reason: R002 Missing observers.
    //   Diffblue Cover was unable to create an assertion.
    //   There are no fields that could be asserted on.

    // Arrange and Act
    new Security();
  }
}

