package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            List<List<Integer>> list = new ArrayList<>();

            quickSort(arr,0,arr.length-1);

            int min = Integer.MAX_VALUE;
            for(int i=0;i<arr.length-1;i++){
                min = Math.min(min,arr[i+1]-arr[i]);
            }

            for(int i=0;i<arr.length-1;i++){
                if(arr[i+1]-arr[i]==min)
                    list.add(Arrays.asList(arr[i],arr[i+1]));
            }

            return list;
        }

        public void quickSort(int[] A , int low , int high ){
            if(low>=high) return;
            int start =  low;
            int end =  high;
            int mid = start + (end-start)/2;
            int pivot = A[mid];

            while(start<=end){
                while(A[start]<pivot) start++;
                while(A[end]>pivot) end--;

                if(start<=end){
                    int temp = A[start];
                    A[start]=A[end];
                    A[end]=temp;
                    start++;
                    end--;
                }
            }

            quickSort(A,low,end);
            quickSort(A,start,high);

        }
    }
}
