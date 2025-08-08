import java.util.*;
class Student implements Comparable <Student>{
    int roll;
    String name;
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    // Natural order = sort by roll number (ascending)
    @Override
    public int compareTo(Student other) {
        return this.roll - other.roll; // ascending order
    }
    public String toString() {
        return roll + " - " + name;
    }

}
public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(102, "Rohit"));
        list.add(new Student(101, "Amit"));
        list.add(new Student(103, "Neha"));

        Collections.sort(list);
        System.out.println("Sorted by roll: " + list);

    }
}
