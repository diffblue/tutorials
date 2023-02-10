package replay.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;
import replay.base.Language;

class PersonDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Person#Person(String, String, Email, int, Language)}
  *   <li>{@link Person#setAge(int)}
  *   <li>{@link Person#setEmailAddress(Email)}
  *   <li>{@link Person#setLanguage(Language)}
  *   <li>{@link Person#setName(String)}
  *   <li>{@link Person#setSurame(String)}
  *   <li>{@link Person#getAge()}
  *   <li>{@link Person#getEmailAddress()}
  *   <li>{@link Person#getLanguage()}
  *   <li>{@link Person#getName()}
  *   <li>{@link Person#getSurname()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    Person actualPerson = new Person("Name", "Doe", new Email("janedoe", "Domain"), 1, Language.ENGLISH);
    actualPerson.setAge(1);
    Email email = new Email("janedoe", "Domain");

    actualPerson.setEmailAddress(email);
    actualPerson.setLanguage(Language.ENGLISH);
    actualPerson.setName("Name");
    actualPerson.setSurame("Doe");

    // Assert
    assertEquals(1, actualPerson.getAge());
    assertSame(email, actualPerson.getEmailAddress());
    assertEquals(Language.ENGLISH, actualPerson.getLanguage());
    assertEquals("Name", actualPerson.getName());
    assertEquals("Doe", actualPerson.getSurname());
  }
}

