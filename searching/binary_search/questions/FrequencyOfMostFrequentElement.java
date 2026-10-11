package binary_search.questions;

import java.util.Arrays;

public class FrequencyOfMostFrequentElement {

        public int maxFrequency(int[] nums, int k) {
            Arrays.sort(nums);
            int left = 0;
            int right = 0;
            long currTotal =0;
            long maxRange = 0;
            while(right<nums.length){
                long range = right-left+1L;
                currTotal+=nums[right];
                if(range*nums[right] > (currTotal+k)){
                    currTotal-=nums[left];
                    left++;
                }
                maxRange = Math.max(maxRange,right-left+1);
                right++;
            }

            return (int)maxRange;
        }
}
