package arrays;

public class Engineerdigest {
    public static void main(String[] args){

    // int x=1;
    // int y=2;
    // int z=3;

    // int[] arr={1,2,3};
    

    // int[] arr= new int[10]; 
    // arr[3]=45; // assigning value

    // traversing an array
    // for(int i=0; i<10; i++){
    //     System.out.println(arr[i]);
    // }

    // int[] arr1={1,2,3};
    // System.out.println(arr1); // [I@1b6d3586]
    // for(int i=0; i<arr1.length;i++){
    //     System.out.println(arr1[i]);
    // }

    // ye  for(int i=0; i<arr1.length;i++) likhna bhut bhari lgra hai

    
    // for(int i: arr1){
    //     System.out.println(i);
    // }


    // search and element in an array
    // int arry[]= {1,4,2,55,7,-2}; // search for 55
    // for(int i: arr){
    //     (if i==55){
    //         System.out.println("Found");
    //     }
    // }

    // find max element
    // int[] finmax={2,11,33,53,13,8};
    // int res= Integer.MIN_VALUE; //negative infinity- sbse chota no. hoga

    // for(int i: finmax){
    //     if(i> res){
    //         res=i;
    //     }
    // }

    // System.out.println(res);

    // reverse print an array
    // int[] revArr={1,2,3,4,5};
    // for(int i=revArr.length-1; i>=0 ; i--){
    //     System.out.println(i);
    // }

    // sum of array
    // int[] sumArr={1,2,3,4,-5,90};
    // int sum=arr[0]+arr[1];
    // int sum=0;
    // for(int i=0; i<sumArr.length;i++){
    //     sum+=sumArr[i];
    // }
    // System.out.println(sum);


    // 2D Array
    // int[][] twoDarr=new int[3][3];
    // arr[0][0]=1;
    // arr[0][1]=2;
    // if you want to access 6. How will you
    // int[][] matrix={
    //     {1,2,3},
    //     {4,5,6},
    //     {7,8,9}
    // }
    // System.out.println(matrix[1][2]);

    // for(int i=0;i<matrix.length;i++){
    //     System.out.println(matrix[i]); // ye print ni hogi, hashcode print hojaega
    // }

    // for(int i=0; i<matrix.length;i++){
    //     for(int j=0; j<matrix.length;j++){
    //         System.out.println(matrix[i][j]);
    //     }
    // }

    char arr[][]=new char[3][2];
    arr[0][0]='a';
    arr[0][1]='b';
    arr[1][0]='c';
    arr[1][1]='d';
    arr[2][0]='e';
    arr[2][1]='f';
    for(char i=0; i<arr.length;i++){
        for(char j=0; j<arr[i].length; j++){
            System.out.println(arr[3][2]+ " ");
        }
        System.out.println();
    }

    // jagged array






    }
}
