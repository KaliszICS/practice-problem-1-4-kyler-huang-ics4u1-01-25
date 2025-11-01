import java.io.*;
import java.util.Scanner;

public class PracticeProblem {
    public static void main(String[] args) {
        String file = "file.txt";

        System.out.println(getName(2, file));
        System.out.println(getAge(3, file));
        System.out.println(getNumber(1, file));

        fileAppend("Kyler 17 100000", file);
    }

    public static String getName(int line, String file) {
        try {
            Scanner sc = new Scanner(new File(file));
            int count = 1;
            while (sc.hasNextLine()) {
                String[] parts = sc.nextLine().split(" ");
                if (count == line) {
                    sc.close();
                    return parts[0] + " " + parts[1];
                }
                count++;
            }
            sc.close();
        } catch (Exception e) {}
        return "";
    }

    public static int getAge(int line, String file) {
        try {
            Scanner sc = new Scanner(new File(file));
            int count = 1;
            while (sc.hasNextLine()) {
                String[] parts = sc.nextLine().split(" ");
                if (count == line) {
                    sc.close();
                    return Integer.parseInt(parts[2]);
                }
                count++;
            }
            sc.close();
        } catch (Exception e) {}
        return -1;
    }

    public static int getNumber(int line, String file) {
        try {
            Scanner sc = new Scanner(new File(file));
            int count = 1;
            while (sc.hasNextLine()) {
                String[] parts = sc.nextLine().split(" ");
                if (count == line) {
                    sc.close();
                    return Integer.parseInt(parts[3]);
                }
                count++;
            }
            sc.close();
        } catch (Exception e) {}
        return -1;
    }

    public static void fileAppend(String output, String file) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(file, true));
            pw.println(output);
            pw.close();
        } catch (Exception e) {}
    }
}