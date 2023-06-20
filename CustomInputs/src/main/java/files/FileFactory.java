package files;

import java.io.*;

public class FileFactory {

    // factory method
    public static File load(String filename) {
        File file = new File(filename);
        return file;
    }

}