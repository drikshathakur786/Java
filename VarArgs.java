import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(2,3,4,5,56,87,23,45,65);// can take any no. of arguments
        
        fun();

        // multiple(2,"John","Reet","Ravi"); You cannot skip any argument like this. Ordering is important.
        

        multiple(2,3,"John","Reet","Ravi");

        // demo(); // ambiguity error means it is not able to decide which method to call.
        
        demo(2,3,4); // int varargs

        demo("John","Reet","Ravi"); // String varargs

    }
    

    // static void multiple(int a, String ...v, int b ){

    // }
    // This is also not allowed. VarArgs should be the last argument in the method. 

    static void multiple(int a, int b, String ...v){


    }


    static void fun(int ...v){ // array of integers
        System.out.println(Arrays.toString(v));
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}

// VarArgs in java means variable arguments. It is a feature that allows a method to accept zero or multiple arguments.

// when you create a method that takes a variable no. of arguments

// VarArgs means when we donot know how many arguments we have to pass in the method.

//you must specify the type of arguments followed by three dots (...). The three dots are called an ellipsis.