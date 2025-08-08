import java.util.*;
public class PracQuesOne {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Amit","Sneha","Ria","Ria"));
        ArrayList<String> unique = new ArrayList<>();

        for(String name: names){
            if(!unique.contains(name)){
                unique.add(name);
            }
        }
        System.out.println("Original: "+ names);
        System.out.println("Without duplicates: "+unique);
    }
}
