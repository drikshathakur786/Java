import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;

public class Main{
    public static void main(String[] args) {
//        int arr = new int[10];

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(80);
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());

        // printing each element
        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        // iterating over the collection itself
        for(int x: arrayList){
            System.out.println(x);
        }

        // checking existence
        System.out.println(arrayList.contains(3));
        System.out.println(arrayList.contains(1));

        // removing an element
        arrayList.remove( 2);

        // adding an element in between
        arrayList.add(2, 59);
        for(int y:arrayList){
            System.out.println(y);
        }

        // replacing the element at 2nd index
        arrayList.set(2, 59);
        System.out.println(arrayList);

        ArrayList<Integer> list = new ArrayList<>(1000);
//        System.out.println(list.get(0));
        System.out.println(list.size());

        // automatically shrink size
//        arrayList.trimToSize();

        // using iterator
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        Iterator<Integer> it = numbers.iterator();
        System.out.println("Using Iterator:");
        while (it.hasNext()) {
            int num = it.next();
            System.out.println(num);
        }

        // Check and Remove with contains, isEmpty, clear
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Mango");
        colors.add("Orange");
        if(colors.contains("Green")){
            System.out.println("Green is present");
        }
        colors.clear();
        if(colors.isEmpty()){
            System.out.println("No element");
        }

    }
}