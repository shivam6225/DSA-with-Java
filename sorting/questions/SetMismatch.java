package questions;

import java.util.Arrays;
import java.util.List;

public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] nums) {
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

        for(i=0;i<nums.length;i++){
            if(i!=nums[i]-1) {
                return new int[] {nums[i],i+1};
            }
        }

        return new int [] {-1,-1};
    }

    private static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
