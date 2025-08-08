// Numbers List – Using ListIterator, and adding/removing at specific index
import java.util.*;
public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(0,100);
        nums.add(200);
        nums.add(300);
        nums.add(1, 150);

        System.out.println("Initiallist: " + nums);



        ListIterator<Integer> listIt = nums.listIterator();
        System.out.println("Forward Traversal:");
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }
        System.out.println("Backward Traversal:");
        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }
        nums.remove(2);
        System.out.println("After removing index 2: " + nums);

    }
}
