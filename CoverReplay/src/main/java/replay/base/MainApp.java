package replay.base;
import replay.logic.Email;
import replay.logic.PersonException;
import replay.logic.PersonService;

import java.util.Scanner;

public class MainApp {

    public static String getMessage() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {

        System.out.println("Enter Your Name:");
        String name = getMessage();
        System.out.println("Enter Your Surname:");
        String surname = getMessage();
        System.out.println("Enter Your Username:");
        String username = getMessage();
        System.out.println("Enter Your Domain:");
        String domain = getMessage();
        System.out.println("Enter Your Age:");
        int age = Integer.parseInt(getMessage());
        System.out.println("Enter Your Language:");
        String language = getMessage();
        Language val = Language.ENGLISH;
        switch(language.toUpperCase()) {
            case "ENGLISH": break;
            case "ITALIAN": val = Language.ITALIAN;
        }

        PersonService obj = new PersonService();
        try {
              obj.createPerson(name, surname,
                 new Email(username, domain),
                 age, val);
              System.out.println("NEW PERSON ADDED");
        } catch (PersonException ex) {
            System.out.println("INVALID INPUTS");
        }
    } // end main()
}

