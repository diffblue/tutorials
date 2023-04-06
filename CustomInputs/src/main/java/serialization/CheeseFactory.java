package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CheeseFactory {
    // factory method
    public static Cheese readSerializedCheese() throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("cheese.ser"))){
            return (Cheese)in.readObject();
        }
    }
}