package concepts;
class Pen{ // esmai hum blueprint define krenge apne pen ka
    String color; // red,blue,black
    String type; // ballpoint, gel
    
    // functions jo class k andar define hote hain unko hum kehte hain methods
    public void write(){
        System.out.println("Writing something");
    }

    // abhi tk humne bs bnaya hai usko launch ni kra
    // object humari bnte hain main class k andar
    public void printColor(){
        System.out.println(this.color);  // this is a keyword- ye es function ko btayega ki es object ko kisne call kiya hai
    }
}


class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){
        System.out.println("Parameterized constructor called");
    }

    // parameterized constructor
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    //copy constructor- cuz ye student 2 ki sari info copy kr k current object k andar dalra hai
    Student(s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    //Student s2= new Student(s1); ye run kre uss se phele s1 ki properties define krni hongi

    
}




public class OOPSS{
    public static void main(String[] args){
        // Pen pen1=new Pen();
        // pen1.color="blue";
        // pen1.type="ballpoint";
        // System.out.println(pen1.color);
        // System.out.println(pen1.type);
        // pen1.write();

        // Pen pen2= new Pen();
        // pen2.color="black";
        // pen2.type="gel";

        // pen1.printColor();
        // pen2.printColor();


        Student s1= new Student();
        // new se object k liye heap k andar memory allocate hojaegi
        // Student()- ye constructor h. Java k andar constructor ka kaam h java k objects ko construct krna

        // ab constructor 3 types k hote hain mtlb constructor ko hum 3 trah se bna skte hai
        // 1. non parameterized constructor- jinke andar functions ni hote
        // Agar hum khudse constructor nhi likhte java k andar toh by default bhi bnjata h
        //2. parameterized constructor-jinke andar parameters pass hore hai. ab main mai aise call krenge. Student s1= new Student("aman",24);
        //3. copy constructor- ek object ko copy kr k dusre object mai dalna



        // NOTE
        //1.constructor nd class name is same (eg student class nd Student())
        //2.constructor kuch return nahi krte. no return type or void or anything
        //3.ek obj k liye constructor sirf ek hee baar call ho skta h

        s1.name="aman";
        s1.age=23;
        s1.printInfo();
    }

} 

// java k andar automatic garbage collector. jo object/variable use ni hora bs memory khara hai usko automatic delete- destructor esliye likhne ki zarurat ni pdti


 