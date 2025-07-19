// import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        // int ans= sum2();
        // System.out.println("Sum= "+ans);

        int ans= sum3(20, 30);
        System.out.println("Sum =  "+ans);
    }


    // pass the value of numbers when you  are calling the method in main
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    // return the value
    // static int sum2(){
    //     Scanner input= new Scanner(System.in);

    //     System.out.print("Enter the first numebr: ");
    //     int num1 = input.nextInt();

    //     System.out.print("Enter the second number: ");
    //     int num2= input.nextInt();

    //     int sum = num1 + num2;

    //     return sum; // function yaha khatam hota hai

        //System.out.println("This will never execute");// unreachable code


    // }


    // static void sum(){
    //     Scanner input= new Scanner(System.in);

    //     int num1 = input.nextInt();
    //     int num2= input.nextInt();

    //     int sum = num1 + num2;

    //     System.out.println("Sum= "+sum);

    // }
    
}
