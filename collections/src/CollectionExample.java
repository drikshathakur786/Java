import java.util.*;
public class CollectionExample {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,70,100,20,30,40,50));
        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.reverse(numbers);
        System.out.println(numbers);

        Collections.shuffle(numbers);
        System.out.println(numbers);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        int frequency = Collections.frequency(numbers, 10);
        System.out.println(min);
        System.out.println(max);
        System.out.println(frequency);

        Collections.swap(numbers, 1, 2);
        System.out.println(numbers);

    }
}
