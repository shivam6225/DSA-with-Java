package shivam;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapArray {

    public static void main(String[] args) {
        int [] arr ={1 ,3 ,23 ,9,18};
        //swap(arr,1,3);

        //System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    //Reverse array using swap function as base
    static void reverse(int[] arr){
        int end = arr.length-1;
        int start =0;
        //Two Pointer Methods
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
