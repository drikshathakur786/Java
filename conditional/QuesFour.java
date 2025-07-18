package conditional;
import java.util.*;


/*Prime Check
Input: 29
Output: true
khudse aur 1 se hi divide ho
*/

public class QuesFour {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        boolean isPrime=true; // assume krlia ki number prime hai
        if(n<=1) isPrime=true; // 0 aur 1 ko prime nhi mana jata
        else{
            for(int i=2; i<=n/2;i++){ // check from 2 to n/2. agr n kisi bhi no. se divide ho jata h toh vo prime nhi hoga
                if(n%i==0){ // agar n kisi bhi i se divide ho jata h toh vo prime nhi hoga
                    isPrime=false;
                    break;
                }
            }
        }
        System.out.println("Is Prime: " + isPrime);
    }
    
}
