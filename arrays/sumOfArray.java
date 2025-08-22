package arrays;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr={20,23,24,35,34,22,56,64,353};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
