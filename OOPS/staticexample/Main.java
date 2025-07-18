package staticexample;

public class Main {
    public static void main(String[] args) {

        Human kunal= new Human(21, "Kunal Kushwaha", 100000, false);
        System.out.println(kunal.age);

        Human aayush= new Human(21, "Aayush", 100000, false);
        System.out.println(aayush.age);

        System.out.println(kunal.population);
        System.out.println(aayush.population); // should show 2(bcz kunal+aayush=2) but it shows 1. why? because population is not static
        // so it is not shared among all the objects of the class
    }
    
}
