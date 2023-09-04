package other.mocking;

import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;
import other.mocking.Service;

class ServiceDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link Service}
  *   <li>{@link Service#warmup()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    Service actualService = new Service();
    actualService.warmup();

    // Assert that nothing has changed
    assertSame(actualService.service, Service.service);
  }
}

