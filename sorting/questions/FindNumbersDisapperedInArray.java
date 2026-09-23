package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindNumbersDisapperedInArray {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = disappreadArray(arr);
        System.out.println(ans);
    }

    private static List<Integer> disappreadArray(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIdx = nums[i]-1;
            if(nums[i]!=nums[correctIdx]){
                swap(nums,i,correctIdx);
            }
            else {
                i++;
            }
        }

        List<Integer> missing = new LinkedList<>();

        for(i=0;i<nums.length;i++){
            if(i!=nums[i]-1) missing.add(i+1);
        }

        return missing;
    }

    private static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
