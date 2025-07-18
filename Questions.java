import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        System.out.println(isPrime(n));
    }
// condition for prime number is that it should be greater than 1

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){ 
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c > n; // return the value of c*c is greater than n
            
    }

    
}
