package enumDemo;
/*
instead of this
public class Day{
public static final String SUNDAY= "SUNDAY";
public static final String MONDAY= "MONDAY";
}
 */
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    
    public void display(){ // method bnare hai enum k andar kyuki hume pta h enum end mai toh ek class hee bnti h toh hum esmai method bna skte h
        System.out.println("Today is: "+this.name());

    }
}

/*
enum is a special Java type used to define collections of constants.
jab bhi ap future mai frequently used data ka collection bnaoge, toh enum use karna
 */