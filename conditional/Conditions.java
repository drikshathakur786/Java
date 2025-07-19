package conditional;
import java.util.*;


public class Conditions {
    public static void main(String[] args){


        // Scanner sc= new Scanner(System.in);    
        // int age= sc.nextInt();
        // if (age>18){
        //     System.out.println("Adult");
        // }else{
        //     System.out.println("Not an adult");
        // }



        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if (num%2==0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }



        // Scanner sc= new Scanner(System.in);
        // int a= sc.nextInt();
        // int b= sc.nextInt();
        // if(a==b){
        //     System.out.println("Equal");
        // }else{
        //     if(a>b){
        //     System.out.println("a is greater");
        // }else{
        //     System.out.println("b is greater");

        // }



        // Scanner sc = new Scanner(System.in);
        // int button= sc.nextInt();
        // if(button==1){
        //     System.out.println("Hello");
        // }else if(button==2){
        //     System.out.println("Namaste");
        // }else if(button==3){
        //     System.out.println("Hola");
        // }else{
        //     System.out.println("Invalid Input");
        // }


        
        // Scanner sc= new Scanner(System.in);
        // int button= sc.nextInt();
        // switch(button){
        //     case 1:
        //     System.out.println("Hello");
        //     break;
        //     case 2:
        //     System.out.println("Namaste");
        //     break;
        //     case 3:
        //     System.out.println("Hola");
        //     break;
        //     default:
        //     System.out.println("Invalid Input");
        // }



        // for(int counter=0; counter<11; counter++){
        //     System.out.println(counter+" ");
        // }
        



        // for loop
        // for(int i=0; i<11; i++){
        //     System.out.println(i);
        // }



        // while loop
        // int i=0;
        // while(i<11){
        //     System.out.println(i);
        //     i++;
        // }



        // do while loop
        // int i=0;
        // do {
        //     System.out.println(i);
        //     i++; 
            
        // } while (i<11);


        // print the sum of first n natural no
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}