import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        int mainLoop = 0;
        int loop1 = 0;
        int loop2 = 0;
        Scanner s = new Scanner(System.in);

        while (mainLoop == 0) {
            System.out.println("Welcome to the Root\n");
            System.out.println("Available Sections: ");
            System.out.println("1) Simple Geometry Programs");
            System.out.println("2) Advanced Simple Programs");
            System.out.println("Please us an integer to indicate what type of program you would like to run: ");
            ;
            String input = s.nextLine();

            switch (input) {
            case "1":
                loop1 = 0;
                while (loop1 == 0) {

                    System.out.println("Available Programs: ");
                    System.out.println("1) Area of a circle");

                    input = s.nextLine();

                    switch (input) {
                    case "1":
                        AOC.MyAOC(s);
                        System.out.println("\n");
                        s.nextLine();
                        break;
                    case "e":
                        loop1 = 1;
                        break;
                    default:
                        System.out.println("Invalid Input");
                    }

                }
                break;
            case "2":
                loop2 = 0;
                while (loop2 == 0) {
                    System.out.println("Available Programs:");
                    System.out.println("1) IOStreams");
                    System.out.println("2) NIOStreams");

                    input = s.nextLine();

                    switch (input) {
                    case "1":
                        System.out.println("Would you like to read the data file or write to it?");
                        System.out.println("1) Write to data file");
                        System.out.println("2) Read from data file");
                        input = s.nextLine();

                        switch (input) {
                        case "1":
                            System.out.println("What would you like to write?");
                            String data = s.nextLine();
                            IOStreams.writeToData(data);
                            break;
                        case "2":
                            IOStreams.readFromData();
                            break;
                        case "e":
                            break;
                        }
                        break;

                    case "e":
                        loop2 = 1;
                        break;
                    default:
                        System.out.println("Reached default case");
                        break;
                    }
                }
            case "e":
                mainLoop = 1;
                break;
            }

        }
        System.out.println("Goodbye!");
        s.close();
        return;
    }
}