package staticexample;
public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    // long population;
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // this.population+=1;
        Human.population+=1;
        // why wrote Human.population instead of this.population?
        

    }
}
