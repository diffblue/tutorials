package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CheeseSerializer {

    public static void main(String[] args) throws IOException {
        Cheese cheese = new Cheese();
        cheese.name = "Gouda";
        cheese.maturity = 2;
        cheese.availability = false;

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cheese.ser"))) {
            out.writeObject(cheese);
        }
    }
}
