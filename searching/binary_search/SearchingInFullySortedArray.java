package binary_search;

import java.util.Arrays;

public class SearchingInFullySortedArray {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,15}};

        System.out.println("Element found at Index"+ Arrays.toString(binarySearchSortedMatrix(arr,13)));

    }

    //search in row for a range
    //TC : O(logN)
    static int[] binarySearch(int[][] arr ,int row ,int start , int end , int target){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[row][mid]==target) {
                return new int[]{row,mid};
            }
            else if (arr[row][mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }

        return new int[]{-1,-1};
    }

    //TC : O(logN)
    //SC : O(1)
    private static int[] binarySearchSortedMatrix(int[][] arr, int target) {
        int rows = arr.length;
        int cols =0;
        if(rows>0) {
            cols = arr[0].length; //be cautious , matrix may be empty
        }

        if(rows==1){
            return binarySearch(arr , 0 , 0,cols-1,target);
        }

        int rowStart =0;
        int rowEnd = rows -1;
        int cMid = cols/2;

        //run the loops till 2 rows are remaining
        while(rowStart < (rowEnd-1)){
            //it will have more than 2 rows
            int mid = rowStart + (rowEnd-rowStart)/2;
            if(arr[mid][cMid]==target){
                return new int[]{mid,cMid};
            }

            else if(arr[mid][cMid]<target){
                rowStart = mid ;
            }

            else {
                rowEnd = mid;
            }

        }

        //now we have 2 rows

        //check whether the middle element columns is equals to target
        if(arr[rowStart][cMid] == target){
            return new int[]{rowStart,cMid};
        }

        if(arr[rowStart+1][cMid] == target){
            return new int[]{rowStart+1,cMid};
        }

        //Search in 1st half
        if(target<=arr[rowStart][cMid-1]){
            return binarySearch(arr,rowStart,0,cMid-1,target);
        }
        //Search in 2nd half
        else if(target>=arr[rowStart][cMid+1] && target<= arr[rowStart][cols-1]){
            return binarySearch(arr,rowStart,cMid+1,cols-1,target);
        }
        //Search in 3rd half
        else if(target<=arr[rowStart+1][cMid-1]){
            return binarySearch(arr,rowStart+1,0,cMid-1,target);
        }
        //Search in 4th half
        else{
            return binarySearch(arr,rowStart+1,cMid+1,cols-1,target);
        }
    }


}
