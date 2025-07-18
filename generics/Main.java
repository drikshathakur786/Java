import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList list=new ArrayList(); // humari arrays type safe nhi h. ye toh object ko store kregi

        list.add("Hello"); // programer kuch bhi store krdera hai
        list.add(123);
        list.add(3.14);

        String str= (String) list.get(0); // aur fr kuch bhi get krlera h
        String integer= (String) list.get(1);
        /*  ISSUE without generics
        - type safety issue hai, 
        - aur manual cast krni pdri hai cheeze
        - no compile time checking
        */

        ArrayList<String> gener= new ArrayList<>(); //generics ka ye concept h ki phele se hee declare krdo type of array. Jaise esmai ab bs strings add/get kr skte h integers etc. nhi

        
    }
    
}

/*
Generics kya hai?
Generics ek feature hai Java ka jo hume type safety aur code reusability provide karta hai.
generic hum allow kta hai kisi bhi type k sath khelne k liye


Generics ka use karke hum type ko parameterize kar sakte hain, jisse hum ek hi class ya method ko alag-alag types ke saath use kar sakte hain. 
"Allow you to define a class, interface, or method with placeholders(type parameters) for the data types they will work with"



 */