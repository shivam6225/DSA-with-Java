package binary_search.questions;

public class SearchInRotatedSortedArrayII {

        public boolean search(int[] arr, int target) {
            int pivot = pivotElement(arr);
            //If you didn't find pivot that means array is not roated
            if(pivot==-1){
                return Search(arr,0,arr.length-1,target);
            }
            //If pivot is found , we found 2 ascending Sorted Arrays
            if(arr[pivot]==target){
                return true;
            }
            //Target bigger than start means in Array 1
            if(target>=arr[0]) return Search(arr,0,pivot,target);
            else return Search(arr,pivot+1,arr.length-1,target);
        }

        private static boolean Search(int[] arr, int start, int end, int target) {
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target>arr[mid]) {
                    start=mid+1;
                }
                else if(target<arr[mid]) end=mid-1;
                else{
                    return true;
                }
            }

            return false;
        }

        static int pivotElement(int[] arr){
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
                    if(start < end && arr[start]>arr[start+1]) return start;
                    start++;
                    if(end > start && arr[end]<arr[end-1]) return end-1;
                    end--;
                }
                // Left side is sorted, pivot must be in the right half
                else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                    start = mid + 1;
                }
                // Pivot is in the left half
                else {
                    end = mid - 1;
                }
            }

            return -1;
        }

}
