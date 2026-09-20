package binary_search.questions;

public class FindInMountainArray {

    //LeetCode Question : Find in Mountain Array
    //Find Peak first
    //Do Agonistic searching then
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target =3;

        System.out.println("Minimum Index of element: "+ search(arr,target));
    }

    static int search(int[] arr , int target){
        int peak = peakElementPos(arr);
        System.out.println("Peak "+ peak);
        int firstTry = agonisticSearch(arr,target,peak,true);
        System.out.println(firstTry);
        if(firstTry!=-1) return firstTry;

        return agonisticSearch(arr,target,peak,false);


    }

    static int peakElementPos(int[] arr){

        int start = 0;
        int end = arr.length -1;

        while(start<end){
            int mid = start + (end-start)/2;
            //We are in decreasing part of array -> move left
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            //We are in increasing part of array -> move right
            else if ( arr[mid]<arr[mid+1]){
                start = mid +1;
            }
        }
        return start;

    }

    static int agonisticSearch (int[] arr , int target , int pos , boolean isAscending) {
        int start;
        int end;
        if (isAscending) {
            start = 0;
            end = pos;
        } else {
            start = pos + 1;
            end = arr.length - 1;
        }
        System.out.println(start + " " + end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) { return mid; }

            if (isAscending) {
                if (target > arr[mid]) start = mid + 1;
                else end = mid - 1;
            } else {
                if (target > arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }

        int mid = start + (end-start)/2;
        if ( target == arr[mid]){
            return mid;
        }

        return -1;
    }
}
