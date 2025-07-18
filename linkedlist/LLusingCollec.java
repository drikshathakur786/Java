package linkedlist;
import java.util.*;

public class LLusingCollec {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);

        list.addLast("this");

        System.out.println(list.size());

        for(int i=0; i<list.size();i++){
            // if(list.get(i)==value); to search something in list
            System.out.println(list.get(i)+" ");
        }
        System.out.println("null");

        list.removeFirst();
        list.removeLast();
        list.remove(3); // 3rd index value will be removed
        
    }

    // if u only write .add by default last mai add hoga
}
