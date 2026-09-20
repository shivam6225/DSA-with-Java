package linear_search;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1 ,4 ,78},
                {23 , -1 , 45 , 5},
                {34 , 56 , 2 , 56}
        };

        int target = 45;

        System.out.println("is Element present in 2D Array: "+ search2DArray(arr,target));

        System.out.println("Element present in 2D Array at index: "+ Arrays.toString(search2DArray2(arr, target)));

        System.out.println("Max Element present in 2D Array: "+ max2DArray2(arr));
    }

    //2D Array Search
    private static boolean search2DArray(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if(arr[row][col]==target){
                    return true;
                }

            }

        }

        return false;

    }

    private static int[] search2DArray2(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if(arr[row][col]==target){
                    return new int[] {row,col};
                }

            }

        }
        return new int[] {-1,-1};
    }

    private static int max2DArray2(int[][] arr) {
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                max = Math.max(max, anInt);
                min = Math.min(min, anInt);
            }
        }
        return max;
    }
}
