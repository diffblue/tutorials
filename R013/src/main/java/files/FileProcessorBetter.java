package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileProcessorBetter {

    // tested
    public static List<String> commentLinesRefactored(List<String> strings) {
        return strings.stream().filter(line -> line.startsWith("#")).collect(Collectors.toList());
    }

    // results in R013
    public static List<String> commentLinesRefactored(File f) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return commentLinesRefactored(lines);
    }

}
