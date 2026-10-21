package questions;

import java.util.*;

public class ThreeSumSmaller {

    class Solution {
        public int threeSumSmaller(int[] nums, int target) {
            int count= 0;

            int n = nums.length;

            if(n<3) return 0;

            Arrays.sort(nums);

            for(int i=0;i<n-2;i++){
                int start = i+1;
                int end = n-1;
                int sum =  target -  nums[i];
                while(start<end){

                    if(nums[start] + nums[end]<sum){
                        count+=end-start;
                        start++;
                    }
                    else{
                        end--;
                    }
                }
            }

            return count;
        }
    }
}
