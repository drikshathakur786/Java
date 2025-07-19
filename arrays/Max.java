package arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr={2,87,34,22,111,9};
        System.out.println(maxRange(arr));
        // System.out.println(maxRange(arr, 1, 3));
    }

    // imagine that array is not empty
    static int maxRange(int[] arr){
        // int max= Integer.MIN_VALUE; // if the array is empty, this will be the max value
        int maxVal= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxVal){
                maxVal= arr[i];
            }
        }
        return maxVal;
    }


}
