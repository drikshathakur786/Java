package stringdemo;

public class Test {
    public static void main(String[] args){

    String name= "Vipul";
    System.out.println(name);

    Student st1= new Student(); // student class ka ek object
    st1.name="Vipul";

    String adrr= new String("India");
    st1.adrr="India";

    st1.rollNumber=6;
    st1.standard=1;
    System.out.println(st1.name);

    String x="Ram"; // stored in pool
    String a= new String("Ram"); // String pool k andar daldega
    String b= new String(x); // in heap
    System.out.println(a==b); // false, bcz new se dono k liye apna alg alg object create hora h aur dono ka address diff hoga

    String c="Ram";
    String d="Ram"; // literal value
    System.out.println(c==d); // true

    }
}

/*
STRING- sequence of characters

jb bhi hum primitive datatypes ki baat krte hain
int a=1;
toh jaha pe 1 store hoga vhi a bhi hoga

lekin non primitive k case mai
jaise Student s1= new Student();
s1 is a reference variable 
new Student() se ek naya object bnare hain memory k andar- konsi memory? HEAP
toh ye jo s1 wala ref variable h ye uss object ko ni store krta, uske address ko store krta hai



*/