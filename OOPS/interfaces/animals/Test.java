package interfaces.animals;

public class Test {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.eat();
        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE); // static value ko aap direct uski class name se kr skte ho 

        Cat ca1= new Cat();
        cat1.eat();

        dog1.run();
    }
}
