package arrays;

import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int x = sc.nextInt();
        System.out.println("Enter size: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // solution
        boolean flag = false; // false means not found
        for(int i=0;i<n;i++){
            if(arr[i]==x){
//                System.out.println("element found");
                flag = true; //true means found
                break; // if element found dont run the loop further
            }
        }
        if (flag==true) System.out.println("found");
        else System.out.println("not found");
    }
}
