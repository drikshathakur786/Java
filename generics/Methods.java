public class Methods {

    public static void main(String[] args){
        Methods test= new Methods();
        Integer[] intArray={1,2,3,4}; 
        test.printArray(intArray);


    }

    public <T> void printArray( T[] array){

        for(int i: array){
            System.out.println(i+" ");
        }
        System.out.println();

    }
    
}
