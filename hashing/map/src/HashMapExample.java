import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("name", "john");
        System.out.println(map.get("name"));

        map.remove("name");
        System.out.println(map);

        System.out.println(map.containsKey("name"));
        System.out.println(map.containsValue("john"));

        System.out.println(map.isEmpty());
        map.clear();






        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 90);
        scores.put("Charlie", 75);

        // Looping through keys
        System.out.println("Keys:");
        for (String name : scores.keySet()) {
            System.out.println(name);
        }

        // Looping through values
        System.out.println("\nValues:");
        for (Integer score : scores.values()) {
            System.out.println(score);
        }

        // Looping through entries
        System.out.println("\nKey-Value Pairs:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }


    }
}
