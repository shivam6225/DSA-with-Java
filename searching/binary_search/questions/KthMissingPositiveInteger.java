package binary_search.questions;

public class KthMissingPositiveInteger {

    class Solution {
        public int findKthPositive(int[] arr, int k) {

            int start = 0;
            int end = arr.length-1;

            while(start<=end){
                int mid = start+(end-start)/2;
                int diff = arr[mid]-mid-1;
                if(diff>=k){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }


            return start+k;

        }
    }
}
