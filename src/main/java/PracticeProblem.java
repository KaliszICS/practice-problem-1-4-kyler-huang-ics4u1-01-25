import java.io.*;

public class PracticeProblem {

    public static void main(String[] args) {
        String file = "file.txt";
        System.out.println(getName(2, file));
        System.out.println(getAge(3, file));
        System.out.println(getNumber(1, file));
        fileAppend("Kyler 17 123456890", file);
    }

    public static String getName(int line, String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String text;
            int count = 0;
            while ((text = br.readLine()) != null) {
                count++;
                if (count == line) {
                    String[] parts = text.split(" ");
                    br.close();
                    if (parts.length >= 2)
                        return parts[0] + " " + parts[1];
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return "";
    }

    public static int getAge(int line, String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String text;
            int count = 0;
            while ((text = br.readLine()) != null) {
                count++;
                if (count == line) {
                    String[] parts = text.split(" ");
                    br.close();
                    if (parts.length >= 3)
                        return Integer.parseInt(parts[2]);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return -1;
    }

    public static long getNumber(int line, String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String text;
            int count = 0;
            while ((text = br.readLine()) != null) {
                count++;
                if (count == line) {
                    String[] parts = text.split(" ");
                    br.close();
                    if (parts.length >= 4)
                        return Long.parseLong(parts[3]);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return -1;
    }

    public static void fileAppend(String output, String filename) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(filename, true));
            pw.println(output);
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
