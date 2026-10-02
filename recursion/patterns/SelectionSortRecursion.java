package patterns;

import java.util.Arrays;

public class SelectionSortRecursion {

    public static void main(String[] args) {
        int[] arr = {-1, 34 , 12 , 45 , -3 , 0};
        selectionSort(arr,arr.length,0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr , int row , int col , int maxIdx){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[maxIdx]){
                maxIdx=col;
            }
            selectionSort(arr,row,col+1,maxIdx);
        }
        else{
            //swap before moving to next highest
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[row-1];
            arr[row-1] = temp;
            selectionSort(arr,row-1,0,0);
        }
    }
}
