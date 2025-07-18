package searching;

public class SearchInRange{
    public static void main(String[] args) {
        
    }

    static int linearSearch(int arr[], int target, int start, int end){
        
        if (arr.length ==0){ 
            return -1;
        }

        for(int index=0; index<arr.length;index++){
           
            int element = arr[index];
            if(element == target){
                return index; // return index of the element
            }
        }

        // this line will execute if none of the above return statements are executed
        // hence the target not found
        return -1;


    }
}