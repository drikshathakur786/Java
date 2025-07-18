package searching;

public class Main {
    public static void main(String[] args){
        int[] nums= {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target =19; // 5
        int target2= 108; //-1
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    //search the target and return the element
    static int linearSearch2(int arr[], int target){
    
        if (arr.length ==0){ 
            return -1;
        }

        for(int element: arr){ 
            if(element == target){
                return element;
            }
        }

        return -1;
    
    }

    //search the target and return true or false
    static int linearSearch3(int arr[], int target){
    
        if (arr.length ==0){ 
            return -1;
        }

        for(int element: arr){ 
            if(element == target){
                return 1; // true
            }
        }

        return -1; // false
    
    }


    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int arr[], int target){
        
        if (arr.length ==0){ // doesnt exist
            return -1;
        }

        // run a for loop
        for(int index=0; index<arr.length;index++){
            //check for element at every index if it is = target
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
