package conditional;
import java.util.*;

/*Factorial (user input)
Input: 5
Output: 120
Note: Factorial of n is the product of all positive integers up to n (n!)
Factorial of 0 is defined as 1
 */

public class QuesThree {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int fact=1;
        for(int i=1; i<=n;i++) fact=fact*i;

        System.out.println("Factorial: "+fact);
    }
    
}
