package stringdemo;

public class StringMethods {
    public static void main(String[] args) {
        
        String name= "RamJiKiJaiHo";
        System.out.println(name.length());

        System.out.println(name.chartAt(5)); // uss index pe jo bhi char hoga vo print krdega
        // name.chartAt(-1); // invalid


        String name2= "Akshit Sharma";
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2); //case ko ignore krdega upper ho cahe lower same manega

        String str1= "remote";
        String str2= "car";
        System.out.println(str1.compareTo(str2)); //compares lexigographically -ascii value

        String name3= "Amar Panchal";
        System.out.println(name3.substring(4, 8));

        System.out.println(name3.toLowerCase());
        System.out.println(name3.toUpperCase());

        String x="     Yo boy ";
        System.out.println(x.trim()); // start nd end mai faltu ka jo space hoga vo htjaega

        String naam= "Amar Panchal";
        System.out.println(naam.replace("Panchal", "Sharma"));
        System.out.println(naam.contains("P"));
        System.out.println(naam.startsWith("Am"));
        System.out.println(naam.endsWith("al"));
        System.out.println(naam.indexOf("A")); // sbse phele jis index pe ara vo print krdega
        System.out.println(naam.lastIndexOf("a"));

        int o= 10;
        System.out.println()




    }
    
}
/*

STRING METHODS
agr merko kuch krna hai toh mai kr skta hu '.' lga k vo sari cheeze access kr skte hain
 */