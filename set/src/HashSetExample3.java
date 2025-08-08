// INSERTION OF TWO SETS
import java.util.*;
public class HashSetExample3 {
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<>(Arrays.asList("Python","Java","C"));
        HashSet<String> setB = new HashSet<>(Arrays.asList("Python", "Swift","C++"));
        System.out.println(setA);
        System.out.println(setB);

        setA.retainAll(setB); // keeps only common elements in set A
        System.out.println(setA); // python common

        if(setA.isEmpty()){
            System.out.println("no common langs");
        }else{
            System.out.println("common langs");
        }

    }
}
