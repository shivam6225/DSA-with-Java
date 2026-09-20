package binary_search;

public class Main {
    public static void main(String[] args){

        int[] arr = {-14 , -12 , 23 , 45 , 68 , 70 , 100 , 125 , 167};
        int target = 70;

        System.out.println("Element found at Index "+ binarySearch(arr,target));

        int[] arrDesc = {1000 , 345 , 123 , 67 ,34 , 23 , 19 , 4 , 2 ,-2 , -4 ,-14};
        int targetDesc = -2;

        System.out.println("Element found at Index "+ binarySearchDesc(arrDesc,targetDesc));
    }

    //return the index or -1
    //Time : O(logN) , Space : O(N)
    static int binarySearch(int [] arr , int target){
        if(arr==null || arr.length==0){
            return -1;
        }

        int start =0;
        int end = arr.length - 1;

        while(start <= end){
            //find the middle element
            // int mid = (start+end)/2; -> this is problem as integer as fixed size
            // let's say we take very large value of start and end
            // might be possible the start + end that we are doing , exceed the range of the integer in java
            int mid = start + (end-start)/2;
            if ( target == arr[mid]){
                return mid;
            }
            else if (target > arr[mid]){
                start = mid +1;
            }
            else {
                end = mid -1;
            }

        }

        return -1;
    }

    static int binarySearchDesc(int [] arr , int target){
        if(arr==null || arr.length==0){
            return -1;
        }

        int start =0;
        int end = arr.length - 1;

        while(start <= end){
            //find the middle element
            // int mid = (start+end)/2; -> this is problem as integer as fixed size
            // let's say we take very large value of start and end
            // might be possible the start + end that we are doing , exceed the range of the integer in java
            int mid = start + (end-start)/2;
            if ( target == arr[mid]){
                return mid;
            }
            //Different then asc Binary Search
            else if (target > arr[mid]){
                end = mid -1;
            }
            else {
                start = mid+1;
            }

        }

        return -1;
    }


}
