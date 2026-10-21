package questions;

import java.util.*;

public class ThreeSumClosest {

    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);

            int diff = Integer.MAX_VALUE;
            int n = nums.length;

            for(int i=0;i<n;i++){
                int sum = 0;

                int start = i+1;
                int end = n-1;

                while(start<end){
                    sum = nums[i]+nums[start]+nums[end];
                    if(Math.abs(target-sum) < Math.abs(diff)){
                        diff=target-sum;
                    }
                    if(target==sum) return target;
                    else if(sum<target) start++;
                    else{
                        end--;
                    }
                }


            }

            return target-diff;
        }
    }
}
