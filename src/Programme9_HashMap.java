import java.util.HashMap;
import java.util.Map;

public class Programme9_HashMap {
    public static void main(String[] args) {
        // Create a HashMap to store names (String) as keys and ages (Integer) as values
        Map<String, Integer> people = new HashMap<>();

        // Add some entries to the HashMap
        people.put("Alice", 25);
        people.put("Bob", 30);
        people.put("Charlie", 35);
        people.put("David", 40);

        // Iterate through the values using a for-each loop
        System.out.println("Ages of people in the HashMap:");
        for (int age : people.values()) {
            System.out.println(age);
        }
    }
}
