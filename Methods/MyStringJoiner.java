import java.util.StringJoiner;

public class MyStringJoiner {
    public static void main(String[] args) {
        String a = "Dog";
        String b = "Cat";
        String c = "SUV";

        StringJoiner sj = new StringJoiner("s and ", "I love ", "s Especially"); // (Joins, Begining Case, End Case)
        sj.setEmptyValue("I don't love anything"); // Empty Case Set
        sj.add(a).add(b).add(c); // Chaining Add calls
        String Result = sj.toString();
        System.out.println(Result);

        int david = 15;
        int dawson = 11;
        int dillon = 7;
        int dork = 2;

        String s2 = String.format("My nephews are %d, %d, %d and %d years old", david, dawson, dillon, dork); // %d is known as a "Conversion"
        System.out.println(s2);
        double avgAge = ((david - dawson) + (dawson - dillon) + (dillon - dork)) / 3.0d;
        String s3 = String.format("Their average age difference is %.2f years", avgAge); //.2f indicated 2 decimal places floating point
        System.out.println(s3);
        // Format Specifiers % [argument index] [flags] [width] [precision] conversion

    }
}