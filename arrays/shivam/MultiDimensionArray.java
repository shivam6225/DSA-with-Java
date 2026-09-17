package shivam;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {

    public static void main(String[] args) {

        /*
            1 2 3
            4 5 6
            7 8 9
         */
        //3 rows and 3 columns

        int[][] arr = new int[3][]; //int[3][]
        //number of columns are not mandatory
        //number of rows is mandatory

        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //number of columns can be dynamic
        int[][] arr2D = {
                {1,2,3}, //0th index
                {4,5}, //1st index
                {7,8,9,10} //2nd index
        };

        //input
        Scanner input = new Scanner(System.in);

        //length -> number of rows
        for (int row = 0; row < arr2D.length; row++) {
            //for each column in every row
            //arr2D[row].length -> getting length of each row while we input
            for(int col=0; col<arr2D[row].length ;col++){
                arr2D[row][col]=input.nextInt();
            }
        }

        for (int row = 0; row < arr2D.length; row++) {
            //for each column in every row
            //arr2D[row].length -> getting length of each row while we input
            for(int col=0; col<arr2D[row].length ;col++){
                System.out.print(arr2D[row][col]+" ");
            }
            System.out.println();
        }

        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }

        //Enhanced for
        for(int[] num : arr2D){
            System.out.println(Arrays.toString(num));
        }



    }
}
