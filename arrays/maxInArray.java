package arrays;

public class maxInArray {
    public static void main(String[] args) {
        // method 2
//        int[] arr = {10, 8, 12, 4, 6, 23, 8};
//        int max = arr[0];
//        for(int i=0;  i<arr.length;i++){
//            if(arr[i]>max)
//                max  = arr[i];
//        }
//        System.out.println(max);

        // method 2
        int[] arr = {10, 8, 12, 4, 6, 23, 8};
        int max = Integer.MIN_VALUE;
        for(int i=0;  i<arr.length;i++){
//            if(arr[i]>max)  max  = arr[i];
            max = Math.max(max,arr[i]);
        }
        System.out.println(max);

        // second largest element
        int smx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max && arr[i]!=max) smx=arr[i];
        }
    }
}
