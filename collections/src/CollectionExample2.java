import java.util.*;
public class CollectionExample2 {
    public static void main(String[] args) {

        // copy, fill, binarySearch
        List<Integer> original = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        List<Integer> copy = new ArrayList<>(Arrays.asList(0,0,0,0,0));

//        Collections.copy(original, copy);
//        System.out.println(copy); // [0,0,0,0,0]
        Collections.copy(copy, original);
        System.out.println(copy);

        Collections.fill(copy, 99);
        System.out.println(copy);

        Collections.sort(original);
        int index = Collections.binarySearch(original, 15);
        System.out.println(index);
    }
}
