import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> myHashmap = new HashMap<String, String>();
        myHashmap.put("Bob1", "Joe2");
        myHashmap.put("Joe1", "Bob2");
        myHashmap.put("billybobjoe", "joebobbilly");
        myHashmap.put("Sensitive", "Information");

        myHashmap.remove("Sensitive");

        System.out.println(myHashmap.containsValue("Bob2"));
        System.out.println(myHashmap.containsKey("Bob2"));
        System.out.println(myHashmap.containsValue("Information"));
        System.out.println(myHashmap.replace("Joe1", "Bob9001"));
        System.out.println(myHashmap.keySet());
        System.out.println(myHashmap.values());
        System.out.println(myHashmap);
    }
}