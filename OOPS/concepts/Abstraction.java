package concepts;
abstract class Animal{
    // abstract mtlb koi ek khayal vo sach nhi hai usko sach nhi krna 
    // eske bare mai hum soch skte hain, esko create kr skte hain pr actual mai use ni kr skte

    // ab abstract class k andar hum kuch properties nd functions ko bhi abstract bna skte hain
    abstract void walk();
    public void eats(){
        System.out.println("Animal eats");
    }
    Animal(){
        System.out.println("Animal constructor");
    }

}
// phele animal ka constructor run hoyega fr horse ka
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor"); 
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Chicken extends Animal{ 
    // animal class esmai ek trah se irrelevant hai
    // uski cheeze hume user ko dikhane ki zarurat nai hai
    // and anyways hum animal class ka koi object toh bna hee ni skte kyuki animal koi specific animal toh hai hee ni koi type hee ni hai 
    // toh animal class ko hum krdenge abstract
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}



public class Abstraction {
    public static void main(String[] args) {
        Horse horse= new Horse();
        horse.walk();

        Animal animal= new Animal();
        animal.walk(); // error cuz Animal bs ek concept/ blueprint hai usko actual mai create ni kr skte. Run time error- cuz compilation k time koi red line nhi h
    }
}

/*  
ABSTRACTION
user ko imp cheeze dikha dena aur faltu cheeze uss se chupa lena


abstraction implement krne k 2 tarike hain
1. abstract keyword use krna
2. interfaces use kre

- abstract class must be declared with an abstract keyword
- it can have abstract and non-abstract methods
- it cannot be instantiated(mtlb uska object ni bna skte)
- it can have constructors and st atic methods also
- it can have final(jisko ap change ni kr skte, once defined) methods which will force the subclass not to change the body of the method 




CONSTRUCTOR CHAINING
sbse phele base class ka constructor call hota h fr derived ka




INTERFACES- eske andar pure abstraction hoti hai
- all fields in interface are public, static and final by default
- all methods are public and abstract by default
- a class that implements an interface must implement all the methods declared in the interface
- interfaces support the functionality of multiple interfaces

interface Animal{
    int eyes=2; // fixed hai. sare animals k liye eyes 2 he hongi
    void walk();
}
interface Herbivore{

}
Class Horse implements Animal, Herbivore{ // multiple interfaces
    public void walk(){ // implementing the function
        System.out.println("walks on 4 legs");
    }
}



STATIC KEYWORD
vo cheez jo sbke liye accessible hai
static hum un properties ko btate hain jo class k liye common hoti hain
static mai jitni bhi cheeze hoti hain unko memory ek hee baar di jati h, but object mai bar bar dete hain

*/

class Student{
    String name;
    static String school;
    // hr ek student k liye kya school ka naam alag alag hone wala hai? nhi

    // static String school se kya hoga student class k jitne bhi objects bnege un sbke liye school ka naam same hoga

}
public class Abstraction{
    public static void main(String[] args) {
        Student.school="JMV"; // static ko ap directly class k naam se use  kr skte ho no need to create object
        Student student1= new Student();
        student1.name="tony";
        System.out.println(student1.school);
    }

}