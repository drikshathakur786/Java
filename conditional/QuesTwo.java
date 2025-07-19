package conditional;

/*2. FizzBuzz from 1 to n (user input) 
Input: 15
Output: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz
Note: Fizz for multiples of 3, Buzz for multiples of 5, FizzBuzz for multiples of both
 */

public class QuesTwo {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0) System.out.println("FIZZBUZZ");
            else if(i%3==0) System.out.println("FIZZ");
            else if(i%5==0) System.out.println("BUZZ");
            System.out.println(i); // otherwise jo no. hai vhi print hoye
        }
    }
    
}
