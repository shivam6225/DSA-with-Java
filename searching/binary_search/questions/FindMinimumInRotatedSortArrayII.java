package binary_search.questions;

public class FindMinimumInRotatedSortArrayII {

    class Solution {
        public int findMin(int[] nums) {

            return nums[pivotElement(nums)+1];

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
}
