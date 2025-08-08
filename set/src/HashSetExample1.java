import java.util.*;
public class HashSetExample1 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Aman");
        names.add("Ria");
        names.add("Sia");
        System.out.println(names);

        System.out.println(names.contains("karan")); // false
        names.remove("Sia");
        System.out.println(names);
        System.out.println(names.size());
    }
}
