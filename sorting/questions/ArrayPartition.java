package questions;

public class ArrayPartition {

    class Solution {
        public int arrayPairSum(int[] nums) {

            quickSort(nums,0,nums.length-1);
            int total =0;

            for(int i=0;i<nums.length;i+=2){
                total+=nums[i];
            }

            return total;

        }

        void quickSort(int[] arr,int low,int high){
            if(low>=high) return;

            int start = low;
            int end = high;

            int mid = start + (end-start)/2;
            int pivot = arr[mid];

            while(start<=end){
                while(arr[start]<pivot) start ++;

                while(arr[end]>pivot) end--;

                if(start<=end){
                    int temp = arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                    end--;
                }
            }

            quickSort(arr,low,end);
            quickSort(arr,start,high);
        }
    }
}
