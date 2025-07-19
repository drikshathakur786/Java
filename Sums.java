import java.util.Scanner;

public class Sums{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int num1 = input.nextInt();
        int num2= input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum= "+sum);
    }
}
/*
input that will work
10 
10

10 10

input that will not work
10 "bro"

10 40.7

 */ 