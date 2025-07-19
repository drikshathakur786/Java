public class PassingExample {
    public static void main(String[] args) {
        String name = "John Doe";
        greet(name);
    }

    static void greet(String naam){

        // john doe will be replaced in naam
        // naam doesnt care what this name is
         
        System.out.println(naam);
    }
}
