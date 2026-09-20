package binary_search.questions;

import java.util.Arrays;

public class FirstLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,9};
        int target =7;

        System.out.println("First and Last Positions: "+ Arrays.toString(searchRange(arr,target)));
    }

    static int[] searchRange(int[] nums , int target){

//        int tarS =-1;
//        int tarE =-1;
        int[] ans = {-1,-1};

        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);

        return ans;
    }

    static int search(int[] nums , int target , boolean findStartIndex){
        int start =0;
        int end = nums.length -1 ;

        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>nums[mid]) start = mid+1;
            else if (target < nums[mid ]) {
                end = mid -1;
            }
            else {
                //potential ans found
                ans =mid;
                if(findStartIndex) {
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }

        return ans;
    }
}
