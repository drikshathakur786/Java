public class Basics {
    public static void main(String[] args){
        
        // if loop- when you want to run the loop only once
        if(true){ // explicitly true
            System.out.println("Hello World");
        }

        
        // while loop- when  you dont know how many times you want to run the loop
        int count=1;
        while(count!=5){
            System.out.println(count);
            count++;
        }

        // for- when you know how many times you want to run the loop
        // for(int count=1; count!=5; count++){
        //     System.out.println(count);
        // }
    }
}
