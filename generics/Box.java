public class Box<T extends Number> { // ye jo T hai na espe hum condition lga skte hain esi ko bolte hain BOUNDED TYPE PARAMETERS. jaise ess T pe humne condition lgai ki ya toh ye T extend krta hoga class ko ya fr implement krta hoga interface ko
    private T value;

    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value=value;
    }
}

class Boxx <T extends Number & Printable>{ // phela humesha class hogi aur dusri humesha interface hogi ye syntax hai BOUNDED TYPE PARAMTERES ka

}
// box jo h vo ab generic type bn chuki h




/*
GENERIC CLASS SYNTAX

class className<T>{
    
}

NAMING CONVENTION
T: type
E: element (used in collection)
K: Key (used in maps)
V: value (used in maps)
N: number


generics ka fayida kya h?
manlo apne ek string k sath box bnana tha ek integer k sath
aise toh bhut sari classes bnani pdti. duplication of code hojata



REVISION
- type safety
- class
- interface
- bound [T extends number]
*/