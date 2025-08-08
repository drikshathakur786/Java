import java.util.*;
public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(30); // duplicate across sets
        set2.add(40);
        set2.add(50);

        set1.addAll(set2); // merged
        System.out.println(set1);

        for(Integer val: set1){
            System.out.println(val);
        }

        set1.clear();
        System.out.println(set1);
    }
}
