package binary_search.questions;

public class RotatedCountInRotatedArray {

    public static void main(String[] args) {
        int[] arr = {4,5,6,6,7,7,7,0,1,2};

        int target = 5;

        int[] arr2 ={2,5,9,9,2,2,2,2,2};

        System.out.println("Rotation count for Array: "+ rotatedCount(arr));

        System.out.println("Rotation count for Array: "+ rotatedCount(arr2));
    }

    private static int rotatedCount(int[] arr) {
        int pivot = pivotElement(arr);
        //If you didn't find pivot that means array is not rotated
        if(pivot==-1) return 0;

        return pivot+1;
    }

    //this will not work for duplicate values
    static int pivotElement(int[] arr){
        int start =0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            //4 cases here
            if(mid<end && arr[mid]>arr[mid+1]) return mid;
            else if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
            else if(arr[start]>=arr[mid]) end=mid-1;
            else if(arr[start]<arr[mid]) start=mid+1;
        }

        return -1;
    }


}
