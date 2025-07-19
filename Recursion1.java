public class Recursion1 {
    // public static void printNumb(int  n) {
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n-1);
    // }

    // public static void main(String args[]){
    //     int n=5;
    //     printNumb(n);
    // }
    



    // public static int calcFactorial(int n){
        
    //     if(n==1 || n==0){
    //         return 1;
    //     }
        
        
    //     int fac_nm1=  calcFactorial(n-1);
    //     int fact_n = n*fac_nm1;
    //     return fact_n;

    // }
    // public static void main(String[] args) {
    //     int n=5;
    //     int ans = calcFactorial(n);
    //     System.out.println(ans);
    // }




    // public static void printFib(int a, int b, int n) {
    //     if(n==0){
    //         return;
    //     }
        
    //     int c= a+b;
    //     System.out.println(c);
    //     printFib(b,c,n-1);

    // }

    // public static void main(String[] args) {
    //     int a=0, b=1;
    //     System.out.println(a);
    //     System.out.println(b);
    //     int n=7;

    //     printFib(a, b, n-2);

    // }




    // public static int calcPower(int x, int n){

    //     if(n==0){ // base case 1
    //         return 1; 
    //     }
    //     if(x==0){ // base case 2 
    //         return 0;
    //     }
    //     int xPowernm1= calcPower(x, n-1); // kaam
    //     int xPown = x*xPowernm1;
    //     return xPown;
    // }
    // public static void main(String args[]){
    //     int x=2, n=5;
    //     int ans= calcPower(x,n);
    //     System.out.println(ans);
    // }



    public static int calcPower(int x, int n){

        if(n==0){ // base case 1
            return 1; 
        }
        if(x==0){ // base case 2 
            return 0;
        }
        

        if(n%2==0){ // n is even
            return calcPower(x, n/2)*calcPower(x, n/2);
        }else{ //ṇ is odd
            return calcPower(x, n/2)*calcPower(x,n/2)*x;
        }
    }
    public static void main(String args[]){
        int x=2, n=5;
        int ans= calcPower(x,n);
        System.out.println(ans);
    }
}
