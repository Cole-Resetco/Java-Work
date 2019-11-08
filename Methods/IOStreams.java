
import java.io.*;
//import java.nio.file.*;
//import java.util.*;

public class IOStreams { // class to take an input string and output the individual characters
    public static void writeToData(String data) throws IOException {

        try (BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("./Data/data.txt", true))) {
            String writestring = "\n" + data;

            writer.write(writestring.getBytes());
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }

    }

    public static void readFromData() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("./Data/data.txt"))) {
            // this is a try with reasources error handling. it auto closes our reader while
            // also going
            // through all the necessary checks
            String inval;
            while ((inval = reader.readLine()) != null) {
                System.out.println(inval);
            }
            // -------------------Old way of reading, used inputstream------------------
            // char op;
            // String finalstring = "";
            // int length;
            // while ((length = reader.read()) >= 0) {
            // op = (char) length;
            // finalstring += op;
            // // System.out.println(op);
            // }
            // System.out.println(finalstring);
            // finalstring = "";
            // reader.close();
            // Scanner s = new Scanner(System.in);
            // String mys = s.nextLine();
            // --------------------------------------------------------------------------------
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

}