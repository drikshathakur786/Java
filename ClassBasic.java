class Box {

    double len, wid, height;

    // Constructor with all dimensions
    Box(double a, double b, double c) {
        len = a;
        wid = b;
        height = c;
    }

    // Default constructor (unit cube)
    Box() {
        len = 1;
        wid = 1;
        height = 1;
    }

    // Constructor for a cube
    Box(double a) {
        len = wid = height = a;
    }

    // Method to calculate volume
    double volume() {
        return len * wid * height;
    }

    // Method to calculate surface area
    double surfaceArea() {
        return 2 * (len * wid + wid * height + height * len);
    }

    // toString method for displaying Box information
    public String toString() {
        return "Box with len = " + len + ", wid = " + wid + ", height = " + height;
    }

    // Method to compare volumes of two boxes
    public void larger(Box b) {
        if (this.volume() >= b.volume()) {
            System.out.println("This box is larger or equal to the given box.");
        } else {
            System.out.println("The given box is larger.");
        }
    }

    // Show method to display box details
    public void show() {
        System.out.println(this);
    }
}

public class ClassBasic {
    public static void main(String[] args) {

        // Creating instances of Box
        Box b = new Box(3, 2, 1);
        Box b2 = new Box(5, 2, 1);
        Box b3 = new Box();
        Box b4 = new Box(5);

        // Checking volume condition
        if (b2.volume() > 20) {
            System.out.println("Big box");
        }

        // Display box details
        b.show();
        b2.show();
        b3.show();
        b4.show();

        // Comparing volumes
        b.larger(b2);
    }
}



/*
 * Create a class Complex with data member real and imaginary
 * Create 3 
 */