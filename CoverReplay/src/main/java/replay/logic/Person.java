package replay.logic;
import replay.base.Language;

public class Person {
    private String name, surname;
    private Email email;
    private int age;
    private Language language;

    public Person(String name,
                  String surname,
                  Email email,
                  int age,
                  Language language) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurame(String surname) {
        this.surname = surname;
    }

    public Email getEmailAddress() {
        return email;
    }

    public void setEmailAddress(Email email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
