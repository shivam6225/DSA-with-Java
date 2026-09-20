package binary_search.questions;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,6,7,7,7,0,1,2};

        int target = 5;

        int[] arr2 ={2,5,9,9,2,2,2,2,2};

        System.out.println("Element found at Index: "+ rotatedSearch(arr,target));

        System.out.println("Element found at Index: "+ rotatedSearch(arr2,9));
    }

    private static int rotatedSearch(int[] arr, int target) {
        int pivot = pivotElement(arr);
        //If you didn't find pivot that means array is not roated
        if(pivot==-1){
            return Search(arr,0,arr.length-1,target);
        }
        //If pivot is found , we found 2 ascending Sorted Arrays
        if(arr[pivot]==target){
            return pivot;
        }
        //Target bigger than start means in Array 1
        if(target>=arr[0]) return Search(arr,0,pivot,target);
        else return Search(arr,pivot+1,arr.length-1,target);
    }

    private static int Search(int[] arr, int start, int end, int target) {
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]) {
                start=mid+1;
            }
            else if(target<arr[mid]) end=mid-1;
            else{
                return mid;
            }
        }

        return -1;
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

    static int pivotElementDuplicate(int[] arr){
        int start =0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            //4 cases here
            if(mid<end && arr[mid]>arr[mid+1]) return mid;
            else if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
            //If my element at start==mid==end then skip the duplicates
            else if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //check if start is pivot
                if(arr[start]>arr[start+1]) return start;
                start++;
                if(arr[end]<arr[end-1]) return end-1;
                end--;
            }
            else if(arr[start]>=arr[mid]) end=mid-1;
            else if(arr[start]<arr[mid]) start=mid+1;
        }

        return -1;
    }
}
