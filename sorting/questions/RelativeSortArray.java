package questions;

public class RelativeSortArray {
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int j = relativeSort(arr1,arr2);

            quickSort(arr1,j,arr1.length-1);

            return arr1;
        }

        public int relativeSort(int[] A , int[] B){
            int j = 0;
            for(int i=0;i<B.length;i++){
                for(int k=j;k<A.length;k++){
                    if(A[k]==B[i]){
                        if(k!=j){
                            int temp = A[j];
                            A[j] = A[k];
                            A[k] = temp;
                        }
                        j++;
                    }
                }
            }
            return j;
        }

        public void quickSort(int[] A,int low , int high){
            if(low>=high) return;

            int start = low;
            int end = high ;

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
