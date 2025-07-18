package conditional;

public class ConditionalStatements {
    public static void main(String[] args) {
        
        int age=20;

        if(age>=18){
            System.out.println("You are an adult");
        }


        if(age>=18){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are a child!");
        }


        int age1=50;
        int marks=35;
        // 33/100- to pass, age should be 20
        if(age1<=20 && marks>=33){
            System.out.println("Congrats");
        }else{
            System.out.println("Better luck next time!");
        }


        // ek aisi condition lgao jo humesha chlni cahiye
        if (true) { // hardcode krdia
            System.out.println("Hello!");
        }


        int markss=75;
        // marks >=90  A
        // marks >=75  B
        // marks >=60  C
        // D
        if(markss>=90){ // agr koi sa bhi block true hojata h toh vo ageh check krega hee ni
            System.out.println("A");
        }else if(markss>=75){
            System.out.println("B");
        }else if(markss>=60){
            System.out.println("C");
        }else{
            System.out.println("D");
        }


        // day1= monday, day2= tuesday
        int day=3;
        switch(day){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            default:{
                System.out.println("Invalid");
            }
        }

        // yehi day1= monday wala code userinput se likho
        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int day1= sc.nextInt();
        switch(day1){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
                break;
            }
            default:{
                System.out.println("Invalid day number");
            }
        }



    }
    
}




/*
CONDITIONAL STATEMENTS:
koi condition check krni h

byte, short, char, int, String, Enum type- en sbke sath use kr skte h switch ko

break: switch case se bahar aa jaega 
continue: skips the current iteration and moves to the next one in loops
default: agar koi bhi case match nhi hota toh default case execute hoga
return: exits the current method and returns a value (if applicable)

 */
