package arrays;
import java.util.*;
public class outputOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[7];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[5]=60;
        arr[6]=70;

        // output
        System.out.println(arr[0]+" ");
        System.out.println(arr[1]+" ");
        // not pratical for large no's


        // input using for loop
        for(int i=0;i<=6;i++){
            arr[i]=sc.nextInt();
        }

        // output using for loop
        for(int i=0; i<=6;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
