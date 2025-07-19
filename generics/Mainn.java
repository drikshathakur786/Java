public class Mainn {
    public static void main(String[] args){

        Box<Integer> box1= new Box<>(); // box is now type safe
        box1.setValue(1);
        int i= box1.getValue();
        System.out.println(i);
        

    }
    
}
