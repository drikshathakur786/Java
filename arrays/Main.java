package arrays;

public class Main {

    public static void main(String[] args) {

        // Q: store a roll number
        int a=19;

        // Q: store a person's name
        String name="Kunal";

        //Q: store 5 roll numbers
        int roll1=1;
        int roll2=2;
        int roll3=3;
        int roll4=4;
        int roll5=5;


        // for this, we use ARRAYS
        // Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

        // syntax:
        //datatype[] arrayName = new datatype[size];

        // store 5 roll numbers
        int[] rollNumbers = new int[5];
        int rollNos={23,23,23,23,23}; 


        int[] rollNums; // declaration of an array . rollNums is getting defined in the stack

        rollNums= new int[5]; // initialization of an array. rollNums is getting defined in the heap. This is actual memory allocation. 

        String[] arr = new String[4]; // array of strings
        System.out.println(arr[0]); // null

        //modify
        str[1]="kunal";


    }
    
}


