package stringdemo;

public class Strings {
    public static void main(String[] args){
        // String Declaration:
        // String name= "Tony";
        // String fullName= "Tony Stark"; // string k andar space bhi ek valid character hai
        // String sentence="My name is Tony Stark";

        // user se input lena hai
        // Scanner sc= new Scanner(System.in);
        // String name= sc.nextLine();
        // System.out.println("Your name is:"+name);

        //concatenation- 2 strings ko jodna
        String firstName="Tony";
        String lastName= "Stark";
        String fullName= firstName + " "+ lastName;
        System.out.println(fullName);

        // length of a string
        System.out.println(fullName.length());

        // string k sare characters ko print karna hai- charAt()
        // char print krwane wala kaam hume baar baar krna hai toh loop lga lete hai
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }  

        //compare 2 strings
        String name1= "Tony";
        String name2= "Tony";
        // String name2= "Tony2";

        // if(name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }



        // if(name1 == name2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }



        if(new String("Tony") == new String("Tony")) {
        System.out.println("Strings are equal");
        }else{
        System.out.println("Strings are not equal");
        }

        // not equal ayega kyuki new keyword se ek new object ban rha hai

        String sentence ="My name is Tony Stark";
        String name= sentence.substring(11, sentence.length());
        System.out.println(name);

        // parseInt
        String str="123";
        int num= Integer.parseInt(str);
        System.out.println(num);

        // toString
        int numm= 123;
        String strr= Integer.toString(numm);
        System.out.println(strr);


    }

}
    



