package Sorting;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {

        int[] arr={8,3,4,12,5,6};

        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    //Time : O(NlogN)
    //Space : O(N)
    static void mergeSort(int[] arr,int start , int end){
        if(end -start ==1){
            return ;
        }

        int mid = start+(end-start)/2;

        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);

        merge(arr,start,mid,end);
    }

    static void  merge(int[] arr,int start, int mid , int end){

        int[] mix = new int[end-start];

        int i = start;
        int j=  mid;
        int k=0;

        while(i<mid && j<end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //Add the remaining elements

        while(i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j<end){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l=0 ; l<mix.length;l++){
            arr[start+l] = mix[l];
        }
    }


}
