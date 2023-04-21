package bytecode;

import java.util.ArrayList;

public class Descriptors {

    private final String Student;
    private final long id;

    Descriptors(String student, long id) {
        this.Student = student;
        this.id = id;
    }

    char initial() {
        return Student.charAt(0);
    }

    ArrayList<Integer> lastDigits(int digits) {
        String str = Long.toString(id);
        int len = str.length();
        ArrayList<Integer> array = new ArrayList<>(digits);
        try {
            for (int i = 0; i < digits; i++) {
                array.add(Integer.parseInt(str.substring(len - digits + i, len - digits + i + 1)));
            }

        } catch (StringIndexOutOfBoundsException e) {
            for (int i = 0; i < digits - 1; i++) {
                array.add(0);
            }
            e.getMessage();
        }
        return array;
    }
}