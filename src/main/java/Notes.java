import java.io.*;

class Notes {
    public static void main(String[] args) {

        // FileWriter fw = null;

        // try {
        //     fw = new FileWriter("example.txt"); //Creates a new file, replaces the old one if it already exists
        //     fw.write("Hello\n"); //more similar to print than println (does not add a newline)
        //     fw.write("Bye");
        // }
        // catch (IOException e) {
        //     System.out.println(e);
        // }
        // finally { //always run no matter what. even if you returned in the try, it still runs
        //     try {
        //         if (fw != null) {
        //             fw.close();
        //         }
        //     }
        //     catch (IOException e) {
        //         System.out.println(e);
        //     }
        // }

        // BufferedWriter bw = null;

        // try {
        //     bw = new BufferedWriter(new FileWriter("example2.txt", true));
        //     //adding the true boolean after, changes it from overwriting to appending to the file.

        //     bw.write("Hello\n");
        //     bw.write("Bye");
        // }
        // catch(IOException e) {
        //     System.out.println(e);
        // }
        // finally {
        //     try {
        //         if (bw != null) {
        //             bw.close();
        //         }
        //     }
        //     catch (IOException e) {
        //         System.out.println(e);
        //     }
        // }

        PrintWriter pw = null;

        try {
            pw = new PrintWriter(new FileWriter("example3.txt", true));

            pw.println("Hello");
            pw.print("Bye");
            pw.printf("There are %d apples", 10);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        finally {
            if (pw != null) {
                pw.close();
            }
        }

    }
}
