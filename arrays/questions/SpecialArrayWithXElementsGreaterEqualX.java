package questions;

public class SpecialArrayWithXElementsGreaterEqualX {

    class Solution {
        public int specialArray(int[] nums) {
            int n = nums.length;
            int x = -1;
            int[] freq = new int[n+1];

            for(int i=0 ;i<n;i++){
                freq[Math.min(n,nums[i])]++;
            }

            int greaterOrEqualCount = 0;

            for(int i=n;i>=0;i--){
                greaterOrEqualCount+=freq[i];
                if(greaterOrEqualCount==i){
                    x=i;
                }
            }

            return x;

        }
    }
}
