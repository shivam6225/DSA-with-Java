package binary_search.questions;

public class FindMinimumInRotatedSortArray {

        public int findMin(int[] nums) {

            int pivot = findPivot(nums);

            return nums[pivot+1];
        }


        public int findPivot(int[] arr){
            int start =0;
            int end = arr.length -1;

            while(start<=end){
                int mid = start + (end-start)/2;

                if(end>mid && arr[mid]>arr[mid+1]) return mid;
                else if (start < mid && arr[mid-1]>arr[mid]) return mid-1;
                else if(arr[start]>=arr[mid]) end = mid-1;
                else if(arr[start]<arr[mid]) start = mid+1;
            }

            return -1;
        }
}
