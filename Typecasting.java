import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        float num= input.nextFloat();
        System.out.println(num);

        byte b= 42;
        char c= 'a';
        short s= 1024;
        int i= 50000;
        float f= 5.67f;
        double d= 0.1234;
        double result= (f*b)+(i/c)-(d*s);

        // float + int - double = double
        System.out.println((f*b)+" "+(i/c)+ " "+(d*s));
        System.out.println("result= "+result);
        
    }
}

/*  
conditions for typecasting:

1. The data type of the variable should be compatible with the data type of the value.
10-> 10.0  possible
10-> xyz   not possible

2.The destination data type should be greater than the source data type.
in this case, float > int
in int you can only add int values, but in float both
float num= input.nextFloat(); whatever you have on the lhs should be greater than rhs
int num= input.nextFloat(); not possible

if you are asking for something smaller and giving something bigger, then it will not work



So now, How to convert int to float? 
TYPECASTING/ NARROWING CONVERSION- converting a bigger data type to a smaller data type, explicit conversion

// typecasting
int num= (int)(67.56f);
System.out.println(num); //67

// automatic type promotion in expressions
int a= 257;
byte b= a; // error, why? because byte is smaller than int
byte b= (byte)(a); // 257 % 256 = 1
Max range of byte variable is 256 so why are we getting 1? because of the concept of overflow

the result is the remainder of 257 and 256, which is 1

byte a= 40;
byte b= 50;
byte c= 100;
int d = (a*b)/c; // automatically promoting byte to int
System.out.println(d); //20

40*50= 2000 // how is it able to store 2000 in a byte format? because of automatic type promotion
2000/100= 20


If you do something like:
byte a= 40;
b = b*2; // error, why? because b is a byte and 2 is an int

int num = 'a';
System.out.println(num); //97- ASCII value of a

int num='A';
System.out.println(num); //65


JAVA follows the unicode principles. So you can put all the languages in the world in JAVA.

System.out.println("नमस्ते");
System.out.println("こんにちは");


TYPE PROMOTION rules:
1. All the byte, short, and char values are promoted to int
2. If one operand is long, the whole expression is promoted to long
3. If one operand is float, the whole expression is promoted to float
4. If one operand is double, the whole expression is promoted to double
System.out.println(3*5.6); //16.8 gives float

*/

