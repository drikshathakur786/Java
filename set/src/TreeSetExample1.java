import java.util.*;
public class TreeSetExample1 {
    public static void main(String[] args) {

        // adding numbers in a sorted array
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        System.out.println(numbers);

        // first, last, higher, lower
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10,20,30,40));
        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println("higher: "+set.higher(20)); // gives only one element not all
        System.out.println("lower: "+set.lower(40));

        // subSet, headSet, tailSet
        TreeSet<String> cities = new TreeSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Chennai");
        cities.add("Bangalore");
        System.out.println(cities);
        System.out.println("less than delhi: "+cities.headSet("Delhi")); // checks for the start alphabet
        System.out.println("greater than equal to: "+cities.tailSet("Delhi"));
        System.out.println("chennai to mumbai: "+cities.subSet("Chennai","Mumbai"));


    }
}
