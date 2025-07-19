package enumDemo;

public class Main {
    public static void main(String[] args){
        System.out.println(Day.TUESDAY); //print hojaega 
    
        Day day=Day.MONDAY;
        
        switch(day){
            case MONDAY:{
                System.out.println("Today is monday: ");
                break;
            }
            case TUESDAY:{
                System.out.println("Today is tuesday: ");
                break;
            }
            default:{
                System.out.println("Weekend");
            }
        }
    
    
    
    }

}
