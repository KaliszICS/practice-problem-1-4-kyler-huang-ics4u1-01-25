import java.io.*;
import java.util.*;

public class PracticeProblem {

    // Returns the name on the given line, or "" if line does not exist
    public static String getName(int line, String file) {
        try {
            List<String> lines = readFile(file);
            if (line <= 0 || line > lines.size()) {
                return "";
            }

            String[] parts = lines.get(line - 1).split("\\s+");
            if (parts.length < 3) return "";

            // Combine first and last name
            return parts[0] + " " + parts[1];
        } catch (IOException e) {
            return "";
        }
    }

    // Returns the age on the given line, or -1 if line does not exist
    public static int getAge(int line, String file) {
        try {
            List<String> lines = readFile(file);
            if (line <= 0 || line > lines.size()) {
                return -1;
            }

            String[] parts = lines.get(line - 1).split("\\s+");
            if (parts.length < 3) return -1;

            return Integer.parseInt(parts[2]);
        } catch (IOException | NumberFormatException e) {
            return -1;
        }
    }

    // Returns the student number on the given line, or -1 if line does not exist
    public static int getNumber(int line, String file) {
        try {
            List<String> lines = readFile(file);
            if (line <= 0 || line > lines.size()) {
                return -1;
            }

            String[] parts = lines.get(line - 1).split("\\s+");
            if (parts.length < 4) return -1;

            return Integer.parseInt(parts[3]);
        } catch (IOException | NumberFormatException e) {
            return -1;
        }
    }

    // Appends a given string to the file (no newline), returns nothing
    public static void fileAppend(String output, String filename) {
        try (FileWriter fw = new FileWriter(filename, true)) {
            fw.write(output);
        } catch (IOException e) {
            // Do nothing, tests don't require throwing exceptions
        }
    }

    // Helper method to read all lines safely
    private static List<String> readFile(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line.trim());
            }
        }
        return lines;
    }
}
