public class Shadowing {

    static int x=90; //has its own scope
    public static void main(String[] args) {
        System.out.println(x); //prints 90

         // When you add a another variable in the scope that overlaps, the variable with the higher level scope is shadowed(hidden) by the variable with the lower level scope.

        int x; // the class variable at line 3 is shadowed by this local variable

        // System.out.println(x); //scope will actually begin when the variable is initialized, so this will give an error
        
        x=40; 
        System.out.println(x); //local variable, prints 40

    
        fun();
    }
    
    static void fun(){
        System.out.println(x);
    }
}

// Shadowing in java is a practice of using two variables with the same name within the scope that overlaps.