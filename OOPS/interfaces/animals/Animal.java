package interfaces.animals;
// JAVA doesnot support multiple inheritance but we can achieve this using Interfaces

public interface Animal{

    public int MAX_AGE=150; // kisi bhi animal ki max age 150 set krdi

    public abstract void eat();
    void sleep();

    // STATIC METHODS IN INTERFACES
    public static void info(){
        System.out.println("This is an Animal Interface");
    }
    // public void info(){ // esmai error kyu ara h static htane pe? bcz hum interface se related method bnare hain aur instance ka toh object create hota hee nhi h.
    

    // static methods aye kyu? ap ek info kr k method bna skte ho aur vo uss interface ki sari jankari dedega
    // kisi ko agr interface declare kr diya toh uska koi object ni bn skta
    // static methods sirf interface se access kiye ja skte h
    // static toh ap interface ki help se call kraoge


    // DEFAULT METHODS IN INTERFACES
    default void run(){
        this.eat();
        System.out.println("Animal is running");
    }
    /*
    default keyword use:
    ye ek concrete method h

    agr aap sidha void run() likhdete toh Dog nd cat class k andar uski alag se implementation likhni pdti

    dog1.run();
    */


}
// ye ek blueprint bna dia
// jo future classes hongi vo usko implement krengi







/*

class-> BLUEPRINT for making an object
interface-> BLUEPRINT for making >class

Interfaces mai sirf aur sirf
-abstract methods
-static constants hote h

Interface k 2 use cases hain
- multiple inheritance
- pure abstraction
 */