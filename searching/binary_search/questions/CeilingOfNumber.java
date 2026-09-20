package binary_search.questions;

public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 6;
        System.out.println("Ceiling of Number: "+ ceiling(arr,target));
    }

    //Find the ceiling number for the Target.
    //number >= target
    //Use Binary Search and instead of returning -1 in end , return the start as it will have ahead of end
    //suppose for 15 -> end:14 start:16 -> when while condition breaks
    static int ceiling(int[] arr , int target){
        int start =0;
        int end = arr.length-1;
        if(target>arr[start]) return -1;
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

        return arr[start];
    }
}
