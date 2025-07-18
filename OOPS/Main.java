import concepts.Student;

public class Main{
    public static void main(String[] args){

        // create something that stores 5 roll nos
        int[] rollNos= new int[5];


        // store 5 names
        // String[] names= new String[5]; 
        

        // create something that stores the data of students
        // data of 5 students : {rollNo, name, marks}
        int[] rno= new int[5];
        String[] nme= new String[5];
        float[] marks= new float[5];
        // you created 3 different arrays to store the data of 5 students
        // but you can create a single array to store the data of 5 students
        
        // Student[] students= new Student[5];
        // Student kunal; // student not initialized- output will be null

        // System.out.println(Arrays.toString(students));

        Student kunal= new Student(); // this is a constructor

        Student aayush= new Student();

        // kunal.rollNo= 1;
        // kunal.name= "Kunal";
        // kunal.marks= 90;

        System.out.println(kunal.rollNo);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        // kunal.changeName("Hey");
        kunal.greeting();
        
        
        Student random = new Student(kunal);
        System.out.println(random.name);

        Student one = new Student();
        Student two = one;
        one.name = "Something Something";
        System.out.println(two.name);

    }

}

class Student{
    int rollNo;
    String name;
    float marks;
    // we need a way to add the values of the above properties object by object
    // we need one word to access every object


    Student(){
        // kunal.rollNo= 1; // why kunal? because we are inside the Student class- just refrencing the object. 
        // what if you want to create another student? would you have to write another constructor?
        // kunal.name= "Kunal";
        // kunal.marks= 90;
        this.rollNo= 1; // this is a keyword that refers to the current object
        this.name= "Kunal";
        this.marks= 90; 
    }


    // Student arpit= new Student(17, "Arpit", 95.7f);
    // here, this will be replaced with arpit
    Student(int rollNo, String name, float marks){
        this.rollNo= rollNo;
        this.name= name;
        this.marks= marks;
    }


    Student(Student other){
        this.name= other.name;
        this.rollNo= other.rollNo;
        this.marks= other.marks;
    }

    // Student(){
        // this is how you can call a constructor from another constructor
        // this(1, "Kunal", 90);
        // this refers to the Student(3parameter) constructor

        // internally: new Student();
    // }


    void greeting(){
        System.out.println("Hello! My name is" + name);
        System.out.println("Hello! My name is" + this.name);
        //its giving the same output with/without this, then why use this? 
        // because it is a good practice to use this keyword to refer to the current object
    }


    void changeName(String newName){
        name= newName;
    }

}