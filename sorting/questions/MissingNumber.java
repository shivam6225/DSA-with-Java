package questions;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {3,1,2,0};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    private static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIdx = nums[i];
            if (nums[i]==nums.length) {
                i++;
            }
            else if(nums[i] < nums.length && nums[i]!=nums[correctIdx]){
                swap(nums,i,correctIdx);
            }
            else {
                i++;
            }
        }


        for(i=0;i<nums.length;i++){
            if(i!=nums[i]) return i;
        }

        return nums.length;
    }

    private static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
