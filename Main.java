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
            System.out.println(
                    "Please use an integer to indicate what type of Method you would like to run, or e to return: ");

            String input = s.nextLine();
            System.out.println();

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
                    System.out.println("1) IOStreams (Write or read from data.txt)");
                    System.out.println("2) NIOStreams (zip data.txt)");

                    input = s.nextLine();
                    System.out.println();

                    switch (input) {
                    case "1":
                        System.out.println("Would you like to read the data file or write to it?");
                        System.out.println("1) Write to data file");
                        System.out.println("2) Read from data file");
                        input = s.nextLine();
                        System.out.println();

                        switch (input) {
                        case "1":
                            System.out.println("What would you like to write?");
                            String data = s.nextLine();
                            IOStreams.writeToData(data);
                            break;
                        case "2":
                            IOStreams.readFromData();
                            System.out.println();
                            break;
                        case "e":
                            break;
                        }
                        break;
                    case "2":
                        System.out.println("This Method will zip data.txt and also create two other test files");
                        System.out.println("Press 1 to continue or e to exit");
                        input = s.nextLine();
                        System.out.println();
                        switch (input) {
                        case "1":
                            System.out.println("Ziping files");
                            System.out.println();
                            NIOStreams.zipeFiles();
                            break;
                        case "e":
                            break;
                        default:
                            System.out.println("Default state reached exiting");
                            break;
                        }
                        break;
                    case "e":
                        loop2 = 1;
                        // System.out.println("Returning to root");
                        input = "";
                        break;
                    default:
                        System.out.println("Reached default case");
                        break;
                    }

                }
                break;
            case "e":
                System.out.println("Ending");
                // System.out.println(input);
                mainLoop = 1;
                break;

            default:
                System.out.println("Returning to root");
            }

        }
        System.out.println("Goodbye!");
        s.close();
        return;
    }
}