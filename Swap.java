public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        
        // swap numbers code
        // int temp = a;
        // a = b;
        // b = temp;

        swap(a,b);

        System.out.println(a + " " + b);
        

        String name= "John Doe";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam){
    // naam is only in this scope, in this function
        name = "Jane Doe";
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    } // is it going to swap the value? NO. WHY?
}
