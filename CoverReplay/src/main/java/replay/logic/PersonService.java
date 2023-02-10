package replay.logic;
import replay.base.Language;

public class PersonService {

    public Person createPerson(String name,
                               String surname,
                               Email email,
                               int age,
                               Language language)
            throws PersonException {

        if (name.length() < 3)
            throw new PersonException();
        if (surname.length() < 3)
            throw new PersonException();
        if (age < 12)
            throw new PersonException();
        if (!email.getDomain().contains(".")
                || email.getDomain().length() < 3 )
            throw new PersonException();
        if (email.getUsername().length() < 3 )
            throw new PersonException();

        return new Person(name,
                surname,
                email,
                age,
                language);
    }
}

















