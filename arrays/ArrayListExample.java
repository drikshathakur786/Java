package arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Syntax
        ArrayList<Integer> list= new ArrayList<>();

        // collection framework- ll, stacks, queues, trees, graphs, etc. java provide the implementation of these data structures in the form of classes and interfaces in the java.util package.
        // ArrayList is a part of the collection framework. It is a resizable array implementation of the List interface. It allows dynamic arrays that can grow as needed to accommodate new elements.

        list.add(67);
        list.contains(98);
        list.set(0, 99);  // set the value at 0 index to 99
        list.remove(2);
        

        System.out.println(list); // prints the list

        // input from user
        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }
        // System.out.println(list); 
        
        // get item at any index
        for(int i=0; i<5;i++){
            System.out.println(list.get(i)); // pass index here,list[index] will not work here
        }
        System.out.println(list);
        
    } 
    
}
