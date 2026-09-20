package binary_search;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args){

        int[] arr = {-14 , -12 , 23 , 45 , 68 , 70 , 100 , 125 , 167};
        int target = 70;

        System.out.println("Element found at Index "+ binarySearchAgnostic(arr,target));

        int[] arrDesc = {1000 , 345 , 123 , 67 ,34 , 23 , 19 , 4 , 2 ,-2 , -4 ,-14};
        int targetDesc = -2;

        System.out.println("Element found at Index "+ binarySearchAgnostic(arrDesc,targetDesc));
    }

    //We use this when we don't know the order and have to search on sorted array
    private static int binarySearchAgnostic(int[] arr, int target) {
        if(arr==null || arr.length == 0){
            return -1;
        }

        int start =0;
        int end = arr.length -1;
        //This will give us the order of the binary Search
        boolean isASC = arr[start]<arr[end];


        while(start <= end){
            //find the middle element
            // int mid = (start+end)/2; -> this is problem as integer as fixed size
            // let's say we take very large value of start and end
            // might be possible the start + end that we are doing , exceed the range of the integer in java
            int mid = start + (end-start)/2;
            if ( target == arr[mid]){
                return mid;
            }
            if(isASC){
                if (target > arr[mid]){
                    start = mid +1;
                }
                else {
                    end = mid -1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid -1;
                }
                else {
                    start = mid+1;
                }
            }

        }

        return -1;
    }
}
