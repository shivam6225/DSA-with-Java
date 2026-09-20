package binary_search.questions;


public class FindPositionOfElementInSortedArrayInfiniteNumbers {

    //Array is Sorted Infinite
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,23,45,67,100,123,145,167,200,240,256};
        int target =67;

        System.out.println("Index of an Element: "+ searchInfiniteArray(arr,target));
    }

    //Don't Use length as the array is Infinite
    //Binary Search as it is Sorted Array
    //We will move in Chunk
    //Increase the size of window exponentially
    private static int searchInfiniteArray(int[] nums, int target) {
        //first start with a box of size 2
        int start =0;
        int end =1;

        //condition for target to lie in the range
        while(target>nums[end]){
            int newStart = end+1;
            //double the box value
            end = end + (end- start + 1)*2;
            start = newStart;
        }

        return binarySearch(nums,target,start,end);

    }

    static int binarySearch(int[] nums , int target , int start , int end){

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>nums[mid]) start = mid+1;
            else if (target < nums[mid ]) {
                end = mid -1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }




}
