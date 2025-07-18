public class Scope {
    public static void main(String[] args){
        int a=10;
        int b=20;

        // System.out.println(num);

        String name ="John";
        {
            // int a=78; // if you initialize something, you cannot do it again. But you can change the value
            
            a= 100; // reassign the original ref variable to some other value
            System.out.println(a);

            int c=99;

            // values that are initialized in this block, will remain in the block only. They cant be accessed outside the block

            name="Johen";
            System.out.println(name);
        }
        
        // System.out.println(c);    // cannot use outside the block
        System.out.println(name);


        // scoping in for loops
        for(int i=0; i<4; i++){
            System.out.println(i);
            int num=90;
            a =10; // changing the original value
        }
    }

    static void random(int marks){
        // System.out.println(a); // error- a is not in scope

        int num= 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
