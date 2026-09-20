package binary_search.questions;

public class PeakElementInArray {

    //LeetCode Question
    //Peak Index in Mountain Array
    //Find Peak Element
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};

        System.out.println("Peak element: "+ peakElement(arr));
    }

    static int peakElement(int[] arr){

        int start = 0;
        int end = arr.length -1;

        while(start<end){
            int mid = start + (end-start)/2;
            //We are in decreasing part of array
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else if ( arr[mid]<arr[mid+1]){
                start = mid +1;
            }
        }

        return start;

    }
}
