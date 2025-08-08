package Basics;

public class variables {
    public static void main(String[] args) {

//        int x; // declaration - daba bnana
//        x = 6; // initialization - dabe k andar koi value dedi
//        System.out.println(x);
        System.out.println("x"); // anything inside "" is a text- will be printed as it is

//        int y = 8; // declaration and initialization

//        System.out.println(x+y);

        // = in coding means assigning something
        // x=5 means rhs wali cheez x wale box mai daldo


        int x = 5;
        System.out.println(x);
        x = 7;
        System.out.println(x);
        x = x + 6; // old value of x + 6
        System.out.println(x);
        x = x - 20;
        System.out.println(x);

//        x += 6;
//        x *= 6;
//        x -= 6;
//        x /= 12;

        int a = 5, b = 2;
        System.out.println(a+b); // 7
        System.out.println(a-b); // 3
        System.out.println(a*b); // 10
        System.out.println(a/b); // 2.5 but issue? why 2? remainder
    }
}
