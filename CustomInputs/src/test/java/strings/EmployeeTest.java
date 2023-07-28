package strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EmployeeTest {
    /**
     * Method under test: {@link Employee#setName(String, int)}
     */
    @Test
    void testSetName() {
        Employee employee = new Employee("Name", "Department");
        employee.setName("John", 1);
        assertEquals("John", employee.getName());
    }
}

