package OOPSinJAVA;
import java.util.Scanner;

public class StudentClass {

    // creating a new data type (Student) with multiple attributes(properties).
    public static class Student{
        String name;
        int rollno;
        double percent;

    }
//    public static class Car{
//        String name;
//        String type;
//        int price;
//    }

    public static void func(Student x){
        System.out.println(x.name);
        return;

    }

    public static void change(int x){
        x =7; // pass by value not reference
        return;
    }

    public static void main(String[] args) {

//        int x = 6;
//        func(x+5);


//        Scanner sc = new Scanner(System.in);
//        int z = sc.nextInt();
//        System.out.println("Hello");

        // as we do with other data types:
//        int x;
//        x = 10;

        // we do the same with class
        Student s1 = new Student();
        // initialising object using dot operator
        s1.name = "Ria";
        s1.rollno = 10;
        s1.percent = 89;
        System.out.println(s1.name);

        //  updation
        s1.name = "Riya";
        System.out.println(s1.name);
//        System.out.println(s1);
//        System.out.println(s1.name);
//        System.out.println(s1.percent+8);

//        Student s2 = new Student(); // declaration
//        s2.name = "John";
//        s2.rollno = 40;
//        s2.percent = 90;

//        Car c1 = new Car();
//        c1.name = "Alto";
//        c1.price = 400000;
//        c1.type = "hatchback";

        int x =5;
        System.out.println(x);
        change(x);
        System.out.println(x);


    }
}
