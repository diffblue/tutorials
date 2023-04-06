package strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MemberDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Member#Member(String, String)}
  *   <li>{@link Member#setClub(String)}
  *   <li>{@link Member#getClub()}
  *   <li>{@link Member#getName()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    Member actualMember = new Member("Name", "Club");
    actualMember.setClub("Club");

    // Assert
    assertEquals("Club", actualMember.getClub());
    assertEquals("Name", actualMember.getName());
  }

  /**
   * Method under test: {@link Member#setName(String, long)}
   */
  @Test
  void testSetName() {
    // Arrange
    Member member = new Member("Name", "Club");

    // Act
    member.setName("Name", 1L);

    // Assert
    assertEquals("Name", member.getName());
  }
}

