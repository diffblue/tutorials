package replay.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import replay.base.Language;

class PersonServiceDiffblueTest {
  /**
  * Method under test: {@link PersonService#createPerson(String, String, Email, int, Language)}
  */
  @Test
  void testCreatePerson() throws PersonException {
    // Arrange
    PersonService personService = new PersonService();
    Email email = new Email("antony", ".org");

    // Act
    Person actualCreatePersonResult = personService.createPerson("Anton", "Devit", email, 29, Language.ITALIAN);

    // Assert
    assertEquals(29, actualCreatePersonResult.getAge());
    assertEquals("Devit", actualCreatePersonResult.getSurname());
    assertEquals("Anton", actualCreatePersonResult.getName());
    assertEquals(Language.ITALIAN, actualCreatePersonResult.getLanguage());
    assertSame(email, actualCreatePersonResult.getEmailAddress());
  }

  /**
   * Method under test: {@link PersonService#createPerson(String, String, Email, int, Language)}
   */
  @Test
  void testCreatePerson2() throws PersonException {
    // Arrange
    PersonService personService = new PersonService();

    // Act and Assert
    assertThrows(PersonException.class,
        () -> personService.createPerson("Name", "Doe", new Email("janedoe", "Domain"), 1, Language.ENGLISH));
  }

  /**
   * Method under test: {@link PersonService#createPerson(String, String, Email, int, Language)}
   */
  @Test
  void testCreatePerson3() throws PersonException {
    // Arrange
    PersonService personService = new PersonService();

    // Act and Assert
    assertThrows(PersonException.class,
        () -> personService.createPerson("foo", "foo", new Email("janedoe", "Domain"), 12, Language.ENGLISH));
  }

  /**
   * Method under test: {@link PersonService#createPerson(String, String, Email, int, Language)}
   */
  @Test
  void testCreatePerson4() throws PersonException {
    // Arrange
    PersonService personService = new PersonService();

    // Act and Assert
    assertThrows(PersonException.class,
        () -> personService.createPerson("Anton", "Devit", new Email(".", ".org"), 29, Language.ITALIAN));
  }

  /**
   * Method under test: {@link PersonService#createPerson(String, String, Email, int, Language)}
   */
  @Test
  void testCreatePerson5() throws PersonException {
    // Arrange
    PersonService personService = new PersonService();

    // Act and Assert
    assertThrows(PersonException.class,
        () -> personService.createPerson("Anton", "Devit", new Email("antony", "."), 29, Language.ITALIAN));
  }

  /**
   * Method under test: {@link PersonService#createPerson(String, String, Email, int, Language)}
   */
  @Test
  void testCreatePerson6() throws PersonException {
    // Arrange
    PersonService personService = new PersonService();

    // Act and Assert
    assertThrows(PersonException.class,
        () -> personService.createPerson(".", "Devit", new Email("antony", ".org"), 29, Language.ITALIAN));
  }

  /**
   * Method under test: {@link PersonService#createPerson(String, String, Email, int, Language)}
   */
  @Test
  void testCreatePerson7() throws PersonException {
    // Arrange
    PersonService personService = new PersonService();

    // Act and Assert
    assertThrows(PersonException.class,
        () -> personService.createPerson("Anton", ".", new Email("antony", ".org"), 29, Language.ITALIAN));
  }
}

