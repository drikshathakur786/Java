public class WrapperExample {

    public static void main(String[] args) {
        
        int a=10;
        int b=20;
        swap(a,b);

        Integer num = 45; // this is a wrapper class. its an object now
        // Its basically converting a character into a object so that we can use the methods of the object

        System.out.println(a + " " + b);  // in java its pass by value. But when u pass through a wrapper class, it becomes pass by reference
        
    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
    
}

// final int INCREASE=2; // this is a constant. It cannot be changed. It is a good practice to write the constant in capital letters.