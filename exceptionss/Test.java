package exceptionss;



public class Test {

    // level1();
    
    try{
        level1();
    }catch(Exception e){
        System.out.println(e);
    }

    // ab es se jo output ayega terminal pe thats called
    // STACK TRACE- provide detailed info about method goals that lead to exception
    // simple bhasa mai kis method ne kisko call kiya aur usmai kaha exception aya uski detail


    try{
        FileReader fileReader= new FileReader("a.txt");
    }catch(Exception e){

    }
    public static void main(String[] args) throws FileNotFoundException{ // ab jo esko call krta h jaise yaha main hogya vo uski responsibility hojaega exception handle krne ki
        FileReader fileReader= new FileReader("a.txt");
    }

    public static void method2() throws FileNotFoundException{
        method1();
    }



// throw keyword- kya krta hai?
// ye exception ko throw krta hai, iska use hum tab karte hain jab hume khud se exception throw krna hota hai
    try{
        FileReader fileReader= new FileReader("a.txt");
    } catch(FileNotFoundException e){
        System.out.println("FILE NOT FOUND");
        throw new FileNotFoundException(e); // forcefully ek obj create kr rhe hain exception ka
    }



// finally keyword
    public static void main(String[] args) {
        System.out.println()

    }
    public static int divide(int a, int b){
        try{
            return a/b;
        }catch(Exception e){
            return -1;
        }finally{
            System.out.println("Exception");  // cahe try chle na chle, catch chle na chle, FINALLY ZARUR CHLEGA
        }
        // System.out.println("Exception");  //exception check krne k baad kuch print krana hai
    }



}
public static void level3(){
    int[] arr=new int[5];
    arr[5]=10;
}
public static void level2(){
    level3();
}
public static void level1(){
    level2();

}
//exception aya level3 mai-> level2-> level1-> main

public static int divide(int a, int b){
    try {
        return a/b; // try kro, agr chljata h toh return toh ho hee jaega nhi toh catch
        // jis bhi statement mai apko lgta hai exception ayega vo yaha daldo
    } catch (Exception e) {
        System.out.println(e);
        return -1;

    }

    
}



/*

TYPES OF ERRORS in java:
1. Syntax error- ; lgana bhul gye etc
2. Logical error- apko kuch dia gya h krne k liye lekin apne kuch aur hee krdia
3. Runtime error- compile hone k baad jo run hua aur usmai jo error aya terminal pe. Program will crash during run time errors

30/0- division by zero exception error
Program will run except some cases.
So we will handle those exceptions

EXCEPTION HANDLING (handling exceptions)
The exception handling is a way to handle the runtime errors so that the normal flow of the application can be maintained

EXCEPTION is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.


Java mai hr class extend krti hai object class ko
then throwable
then java.lang.error and java.lang.exception eske andar multiple exceptions hai ye hierarchical nature hai


CHECKED AND UNCHECKED EXCEPTION
eg- array index out of bound- unchecked exception: jo compile time par check nhi huye
eg- file not found-checked exception: jo compile time par check hogaye


THROWS keyword
ye method signature mai use hota hai, iska matlab h ki jo method call ho rha h uski responsibility exception handle krne ki vo usko pass krdi gyi h

THROW keyword
ye method body mai use hota hai, iska matlab h ki jo exception throw ho rha h vo usko throw krdiya gya h

FINALLY keyword- 
ye try-catch block ke baad use hota hai, iska matlab h ki jo bhi code finally block mai likha h vo zarur chalega chahe try block chale ya na chale, catch block chale ya na chale
finally block is used to execute the code that must be executed regardless of whether an exception occurs or not


TRY WITH RESOURCES
allows you to declare resources that will be automatically closed after the try block is executed, even if an exception occurs.
This is particularly useful for managing resources like files, sockets, or database connections that need to be closed to prevent resource leaks.


CUSTOM EXCEPTIONS
You can create your own exception classes by extending the Exception class or RuntimeException class.
 */