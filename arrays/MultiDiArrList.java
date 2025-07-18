package arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class MultiDiArrList {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        
        // syntax
        ArrrayList<ArrayList<Integer>> list= new ArrayList<>

        //initialisation
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }

        // add elements
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list.get(i).add(input.nextInt()); // get the index at i and add something to it
            }
        }

        System.out.println(list);
    }
}