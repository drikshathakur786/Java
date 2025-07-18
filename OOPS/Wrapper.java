public class Wrapper {
    public static void main(String[] args){
        
        int a=1;  // eska data stack mai store hoga
        // a. kr k kuchbhi ni ara. a se related methods/properties nhi h

        String str= "Dog";
        // str. kr k etne sare methods/properties ari hain. kyu are h ? cuz str ek object hai. aur int ek primitve datatype h eski koi class nhi h

        
        Integer b=1; // eska data heap mai store hoga cuz b is an object of class Integer
        // Integer ne wrap krdia ek value ko jo thi primitive type int ki. taki ye object bnjaye aur eske methods hum use kr paye
        // b. krne se ab bhut sare methods are hain

        boolean hasGraphicCard=true;
        Boolean isAdult= true; // wrapper class for primitive 'boolean'

        Float f=1.2f;
        Double d=1.2;
        Character c= 'c';
        Byte bb=1;
        Short s=2;
        Long l=123l;

        Integer b= Integer.valueOf(1); // unecessary boxing
        Interger b=1; // autoboxing- apne aap hee vo primitive ko convert kr dera h Integer mai, Integer.valueOf ye likhne ki zarurat nahi h

        Integer.max(1, 2);

        String str="123";
        Integer i= Integer.valueOf(str);
        System.out.println(i);
    }
}

/*  WRAPPER CLASSES
(primitive datatype ko wrap krdegi)

agr apko kbhi bhi ek primitive integer ko ek object mai create krna ho toh ap wrapper classes ka use krte ho

if want to convert primitive variable into an object- BOXING
vice versa, unboxing

*/