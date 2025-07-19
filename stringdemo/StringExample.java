package stringdemo;
public class StringExample {
    public static void main(String[] args) {
        String message= greet(); // message: "How are you? "
        System.out.println(message);
    }

    static String greet(){
        String greeting= "How are you? ";
        return greeting;

        // return 23; Error
    }

}
