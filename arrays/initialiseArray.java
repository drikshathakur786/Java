package arrays;
import java.util.*;
public class initialiseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter array size: ");
//        int n= sc.nextInt();
//        int[] arr= new int[n]; // variable size array

        int[] nums = {10,20,30,40,90,87,54,4,22,34,50,60};
        // length operator
//        int n= nums.length;
//        System.out.println(n);
        for(int i=0; i<nums.length;i++){
            System.out.println(nums[i]+" "); // all elemets will be printed
        }

    }
}
