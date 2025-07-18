import.java.util.*;

public class HashMap {
    public static void main(String[] args) {
        //country(key), population(value)
        HashMap<String, Integer> map= new HashMap<>();

        // insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        map.put("China",180); // china ki value update hoke 180 hojaegi
        

        System.out.println(map);

        //search

        // check koi cheez map k andar exist krti hai ya nahi
        if(map.containsKey("China")){
            System.out.println("present in the map");
        }else{
            System.out.println("Key is not present");
        }

        // agr merko key k sath wli value bhi cahiye. ki es key k sath konsi value exist krti hai
        System.out.println(map.get("China")); // es key k liye jo value exist krti h usko get kro- key exist
        System.out.println(map.get("Goa"));// key doesnt exist- null output  


        //sari entries ka set- key,value
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //sari keys ka set
        Set<String> keys= map.keySet();
        for(String key: keys){
            System.out.println(key+ " "+ map.get(key));
        }

        map.remove("China"); 

    }
    
}
