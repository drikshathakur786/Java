package hashing;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        HashMap<Integer, String> map= new HashMap<>();
        map.put(1, "Akshit"); // {1=Akshit}
        map.put(2,"Neha");
        map.put(3,"Bro");

        map.get(3);

        map.containsKey(2); // yes=neha
        map.containsValue("Shubham");

        

    }

    
}


/*
hashmap:
think of it as a dictionary
-stores key(word) and value(definition) pair
- keys are unique, values can be duplicate
- one value per key

hashmap mai koi order nhi hota h jis order mai ap store kra rhe ho zaruri nhi h usi order mai aye



 */