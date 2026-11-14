package questions;

public class LongestStrictlyIncreasingOrDecreasingArray {

    class Solution {
        public int longestMonotonicSubarray(int[] nums) {
            int inc=1;
            int dec=1;
            int max = 1;

            for(int i=1;i<nums.length;i++){
                if(nums[i]>nums[i-1]){
                    inc++;
                    dec=1;
                    max=Math.max(inc,max);
                }
                else if(nums[i]<nums[i-1]){
                    inc=1;
                    dec++;
                    max=Math.max(dec,max);
                }
                else{
                    inc=1;
                    dec=1;
                }
            }

            return max;
        }
    }
}
