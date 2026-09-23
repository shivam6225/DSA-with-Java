package questions;

import java.util.LinkedList;
import java.util.List;

public class FindAllDuplicatesInArray {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
    }


    public static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List<Integer> duplicate = new LinkedList<>();
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
            if(nums[i]!=i+1) duplicate.add(nums[i]);
        }

        return duplicate;
    }

    private static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
