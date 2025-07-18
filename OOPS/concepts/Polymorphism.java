package concepts;
// FUNCTION OVERLOADING
// same naam k functions ko ek hee class k andar create krna


class Student{
    String name;
    int age;


    //1
    public void printInfo(String name){
        System.out.println(name);
    }

    //2
    public void printInfo(int age){
        System.out.println(age);
    }

    //3
    public void printInfo(String name, int age){
        System.out.println(name+"  "+age);
    }
}
// same function ko bar-bar alag purpose k liye use krliya
// fayida kya hua? jb object bnaoge uske andar jo bhi values pass kroge automatically detect hojaega konsa function chlna cahiye


public class Polymorphism {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="aman";
        s1.age=67;

        s1.printInfo(s1.name); //1
        s1.printInfo(s1.age);//2
        s1.printInfo(s1.name, s1.age);//3
    }
}


// SOME RULES OF FUNCTION OVERLOADING
// 1. koi na koi differentiating factor hona cahiye. ya parameters diff h ya return type
// 2. ya no. of arguments diff

// esko compile time polymorphism kehte hain cuz jb code compile hora hota h ye tbhi problem detect kr leta h


/*
order
-oops
-polymorphism
-inheritance
-encapsulation
-abstraction
 */