package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessorStart {

    // results in R013
    public static List<String> commentLines(File f) throws IOException {
        List<String> commentLines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("#")) {
                    commentLines.add(line);
                }
            }
        }
        return commentLines;
    }
}
