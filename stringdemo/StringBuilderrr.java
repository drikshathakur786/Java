package stringdemo;

public class StringBuilderrr {
    
    public static void main(String[] args){

        String str1= "Hello";
        str1.concat("World");
        System.out.println(str1); // world hello k piceh nhi lga cuz strings are IMMUTABLE. kyuki ye pool mai jake stored hojati hain

        StringBuilder sb= new StringBuilder("Hello");
        sb.append("World").append("!"); // method chaining
        sb.insert(1,"Java");
        sb.replace(1,3,"World"); // kaha se kaha tk replace krna h
        sb.delete(1,4);
        sb.reverse();
        sb.charAt(0);
        sb.length();
        sb.substring(1,4);



        String string= sb.toString(); // StringBuilder ko string mai convert krne ke liye toString() method use hota hai


        StringBuilder sb1= new StringBuilder();
        // StringBuilder mai andar ek character ki array hoti hai jiska default capacity hota h 16

        

    }
}


/*


        String result="";
        for(int i=0; i<1000;i++){
            result+="HELLO";
        }
        System.out.println(result);

        ye code hazaron temporary strings create kr rha hai which can lead to poor performance

        esi vjha se classes ayi STRING BUILDER AND STRING BUFFER- these are mutable and can be modified without creating new objects


    STRING:
    - mutability: immutable
    - thread safety: yes , cuz cant be changed
    - performance: slow (due to immutability)
    - storage: string pool(for literals)
    - use case: small, fixed texts

    STRINGBUILDER:
    - mutable, method chaining.
    - But thread safe nhi h cuz its mutable
    - performance: fast(no synchronization)
    - storage: heap
    - use case: single thread apps

    STRINGBUFFER:
    agr apko thread safe string cahiye then simply use STRINGBUFFER baki sb same hai
    - mutable
    - thread safety: yes
    - performance: slower(due to synchronization)
    - storage: heap
    - use case: multi threaded apps

 */
