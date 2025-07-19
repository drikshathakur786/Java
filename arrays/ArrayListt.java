import java.util.ArrayList;
import java.util.Collections;
public class ArrayListt {

    public static void main(String[] args){
        // jaise Student st1= new Student();
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1); //0
        list.add(8); //1
        list.add(80); //2
        System.out.println(list.get(3)); //exception ayega
        list.size();
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(int i:list){
            System.out.println(i);
        }

        list.contains(5);

        list.remove(80);

        list.add(2,50); // list.add(konse index pe, kya dalna hai)

        list.set(2,50);



        //CREATING AN ARRAYLIST

        // Default constructor, creates an empty ArrayList with an initial capacity of 10
        ArrayList<String> al1= new ArrayList<>();

        // Creating an arraylist with a specified initial capacity
        ArrayList<String> listWithCapacity= new ArrayList<>(20);

        // ADDING ELEMENTS
        ArrayList<String> list1= new ArrayList<>();
        // adding elements to the end of list
        list1.add("Apple");
        //adding elements at a specific index
        list1.add(1,"Orange");

        // ACCESSING ELEMENTS
        String fruit=list1.get(0); // returns "apple"

        // MODIFYING ELEMENTS
        list1.set(1,"Grapes");

        // REMOVING ELEMENTS
        list1.remove(1); // by index
        list1.remove("Apple"); // by value

        // CHECKING FOR ELEMENTS
        boolean hasApple=list1.contains("Apple");

        // CONVERTING TO ARRAY
        String[] array= list1.toArray(new String[0]);

        //SORTING AN ARRAYLIST
        Collections.sort(list1); // collections ek class hai
    }
}

/*

ArrayList ka istemal hume kb krna hai?
- jb hume ordered collection cahiye
- jb hume duplicates cahiye
jb humein pata nahi hota ki array ki size kya hogi, kyuki arraylist dynamically size ko increase krta rehta hai

unlike array which has a fixed size
ArrayList can grow and shrink as elements are added/removed
this dynamic resizing is achieved by creating a new array when the current array is full and copying the elements to the new array

Internally arraylist kya hai? array hai kisi object ki
ArrayList is implemented as an array of object references
When you add elements to an ArrayList you're essentially storing these elements in this internal array

When you create an ArrayList it has an initial capacity(default is 10). The capacity refers to the size of the internal array that can hold elements before needing to resize
ArrayList<Integer> list= new ArrayList<>();
size? 0 cuz koi elements ni h
capacity? 10


ADDING ELEMENT
following steps occur
- check capacity: internal array ko resize ki zarurat h?
- resize if necessary: if internal array full, arraylist will create a new array with a larger capacity 1.5x the current capacity
- then add elements



TIME COMPLEXITY
- acces by index(get) = O(1)
- add, remove, iteration an element = O(n) 


 */