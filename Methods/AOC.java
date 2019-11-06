import java.util.Scanner;
import java.lang.Math;

public class AOC {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius in feet:");
        double r = s.nextDouble();
        double area = Math.PI * (r * r);
        System.out.println("Area of a Circle is: " + area + " square ft.");
        System.out.println("Hello World!");
        s.close();
    }
}