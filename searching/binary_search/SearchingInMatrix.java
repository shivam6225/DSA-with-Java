package binary_search;

import java.util.Arrays;

public class SearchingInMatrix {

    public static void main(String[] args) {
        int[][] arr = {{10,10,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};

        System.out.println("Element found at Index"+ Arrays.toString(binarySearchMatric(arr,-2)));

    }

    //Time Complexity : O(n) (n+n) -> in worst case
    //Space Complexity : O(1)
    //Sorted row wise and col wise
    static int[] binarySearchMatric(int[][]arr , int target){
        int row =0;
        int col = arr.length-1;

        while(row<arr.length && col >=0){
            if(arr[row][col]==target)
                return new int[] { row,col};
            //if value is greater than target that means whole col is bigger
            else if (arr[row][col]>target)
                col --;
            else
                //if value is less than target that means that row is lesser
                row ++;
        }

        return new int[] {-1,-1};
    }
}
