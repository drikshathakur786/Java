import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args){
        // create an array
        int[] arr={1,2,3,4,5};
        change(arr);

        System.out.println(Arrays.toString(arr)); // toString -converts the array into a string
    }

    static void change(int[] nums){
        nums[0]=99; // if you make a change to the object via this ref variable, same object will be changed
    }
}

// EXPLANATION
// In the above code, we have created an array of integers and passed it to a function change().
// In the change() function, we have changed the value of the first element of the array to 99.
// Since arrays are objects in Java, when we pass an array to a function, we are actually passing the reference to the array.
// This means that the function can modify the array elements directly.
