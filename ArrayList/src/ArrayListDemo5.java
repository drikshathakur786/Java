// removing even numbers using iterators
import java.util.*;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10,120,12,122));
        Iterator<Integer> it = nums.iterator();

        while(it.hasNext()){
            int num = it.next();
            if(num % 2==0){
                it.remove();
            }
        }
        System.out.println("After removing even no: "+ nums);
    }
}

