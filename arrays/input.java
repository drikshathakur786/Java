
package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        // array of primitives
        int[] arr= new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4; 
        arr[4]=5;
        // internally stored as: [1,2,3,4,5]
        System.out.println(arr[3]);
        // this is very time taking

        // input using for loops
        // for(int i=0; i<arr.length;i++){ // when size of the array is not know- arr.length
            // arr[i]= sc.nextInt(); // just for taking input
        // }

        // for(int i=0; i<arr.length;i++){
            // System.out.println(arr[i]); // prints the array elements
        // }


        // just the syntax
        // for(int j: arr){
            // System.out.println(j+ " "); // prints the array elements
        // }


        // for(int num: arr){
            // System.out.print(num+" "); // here num represents element of the array
        // }

        // as you have declared an array of size 5, you can only store 5 elements in it.
        // if you try to store more than 5 elements, it will give an error- index out of bounds exception
        // System.out.println(arr[5]); // this will give an error


        // System.out.println(Arrays.toString(arr)); // prints the array in a single line
        // toString method- when u give an array to it, it basically converts the array to a string and prints it

        // Array of objects
        String[] str= new String[4];
        for(int i=0; i<str.length;i++){
            str[i]=sc.next();
            
        }

        // storage of objects in heap memory

        // modify
        str[1]="kunal";  // this will modify the value of str[1] to kunal
        System.out.println(Arrays.toString(str));

       


    }
}
