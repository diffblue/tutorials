package strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EmployeeDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Employee#Employee(String, String)}
  *   <li>{@link Employee#setDepartment(String)}
  *   <li>{@link Employee#getDepartment()}
  *   <li>{@link Employee#getName()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    Employee actualEmployee = new Employee("Name", "Department");
    actualEmployee.setDepartment("Department");

    // Assert
    assertEquals("Department", actualEmployee.getDepartment());
    assertEquals("Name", actualEmployee.getName());
  }

  /**
   * Method under test: {@link Employee#setName(String, int)}
   */
  @Test
  void testSetName() {
    // Arrange
    Employee employee = new Employee("Name", "Department");

    // Act
    employee.setName("Name", 1);

    // Assert
    assertEquals("Name", employee.getName());
  }
}

