package concepts;
// class Shape{
//     String color;
// }
// class Triangle extends Shape{ // triangle class ne shape class ki properties ko leliya

// }


public class Inheritance{
    public static void main(String[] args){
        Triangle t1= new Triangle();
        t1.color="red";
    } 
}

// INHERITANCE- ess se reusability bdhti h ek hee code ko baar baar nhi likhna pdta
// ek class ki properties/methods jb koi dusri class lena cahti h

// jis class se properties lee jati h vo hoti h base class(parent class)
// jo class properties leti h usko kehte hain sub class(child class)

// 4 types of INHERITANCE

//1. Single Level Inheritance: Base Class-> Derived class
class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

//2. Multi Level Inheritance: Base Class-> Derived class-> Derived class
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

//3. Hierarchial Inheritance: Base Class-> Derived class
//                                      |
//                             Derived class
// ek hee base class ko multiple child classes ne inherit kr rkha h
// class Shape{
//     public void area(){
//         System.out.println("displays area");
//     }
// }
// class Triangle extends Shape{
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

//4. Hybrid Inheritance: diff diff types of inheritance chlre hote h

//5. Multiple Inheritance: Java doesnot support