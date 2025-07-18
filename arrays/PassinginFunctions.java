package arrays;

import java.util.Arrays;

public class PassinginFunctions {
     // Array passing in Function
    public static void main(String[] args) {
        int[] nums = {3,4,5,12}; 
        System.out.println(Arrays.toString(nums)); // 3 
        change(nums);      
    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
