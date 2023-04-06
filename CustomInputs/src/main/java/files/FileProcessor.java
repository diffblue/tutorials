package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileProcessor {

    public static List<String> commentLines(List<String> strings) {
        return strings.stream()
                .filter(line -> line.startsWith("#"))
                .collect(Collectors.toList());
    }

    public static List<String> readFile(File f) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br =
                     new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return commentLines(lines);
    }
}