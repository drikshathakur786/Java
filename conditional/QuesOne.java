package conditional;
import java.util.*;


/*  1. Count digits / uppercase / lowercase in a string (user input)
//    Input: "Hello123"
//    Output: Digits: 3, Uppercase: 1, Lowercase: 4
 */

public class QuesOne {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();

        int digit=0, upper=0, lower=0;

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i); // get character at index i
            // Check if character is digit, uppercase or lowercase
            if(Character.isDigit(ch)) digit++;
            else if(Character.isUpperCase(ch)) upper++;
            else if(Character.isLowerCase(ch)) lower++;
        }

        System.out.println("Digits: "+digit+"Uppercase: "+upper+"Lowercase: "+lower);
    }
    
}
