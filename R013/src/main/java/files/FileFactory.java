package files;

import java.io.*;

public class FileFactory {

    // factory method
    public static File loadFile(String filename) {
        File file = new File(filename);
        return file;
    }

}
