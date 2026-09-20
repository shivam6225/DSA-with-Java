package binary_search.questions;

public class FloorOfNumber {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 11;
        System.out.println("Ceiling of Number: "+ floor(arr,target));
    }

    //Find the floor number for the Target.
    //number <= target
    //Use Binary Search and instead of returning -1 in end , return the end index value as it will have behind of start
    //suppose for 15 -> end:14 start:16 -> when while condition breaks -> 14
    //s=e+1 and s>e
    //so for ceil use s and for floor use e
    static int floor(int[] arr , int target){
        int start =0;
        int end = arr.length-1;
        if(target<arr[start]) return -1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid -1;
            }
            else{
                return arr[mid];
            }
        }

        return arr[end];
    }
}
