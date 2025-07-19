package arrays;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */

        Scanner sc = new Scanner(System.in);
        //  int[][] arr = new int[3][3]; // 2D array of size 3*3
        
         // to store directly
        // int[][] arr = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        // int[][] arr = {
        //     {1, 2, 3} , // 0th index
        //     {4,5}, // 1st index
        //     {6,7,8,9} // 2nd index -> arr2D[2] = {6, 7, 8, 9}
        //     // jagged array- different number of columns in each row
        // }; 


        // to take input
        // for(int i=0; i<arr.length; i++){
        //     arr[i]= sc.nextInt();
        // }
        // for jagged array. we need to take input for each row separately

        int[][] arr= new int[3][2];
        System.out.println(arr.length); // prints the number of rows- 3

        //input for 2D array
        for(int row=0; row<arr.length; row++){
            // for each col in every row
            for(int col=0; col<arr[row].length; col++){ // why arr[row].length? every array at that row is the length of that row
                arr[row][col]= sc.nextInt();
            } 
        }
        //output for 2D array
        for(int row=0; row<arr.length; row++){
            // for each col in every row
            for(int col=0; col<arr[row].length; col++){ // why arr[row].length? every array at that row is the length of that row
                System .out.println(arr[row][col] + " ");
            } 
        }

        // enhanced for loop
        for(int[] row: arr){ // for each row in the array
            for(int col: row){ // for each column in the row
                System.out.print(col + " ");
            }
            System.out.println(); // to print in new line after each row
        }
    }
    }
    

