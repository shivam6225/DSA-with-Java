package binary_search.questions;
import java.util.Arrays;

public class AggressiveCrows {

    class Solution {
        public int aggressiveCows(int[] nums, int k) {

            Arrays.sort(nums);

            int low = 0;
            int high = nums[nums.length-1] - nums[0];

            while(low<=high){
                int mid = low + (high-low)/2;
                if(canWePlace(nums,mid,k)==true){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }

            }

            return high;

        }

        public boolean canWePlace(int[] nums , int dist , int cows){
            int cnt = 1;
            int last = nums[0];

            for(int i=1;i<nums.length;i++){
                if(nums[i]-last>=dist){
                    cnt++;
                    last = nums[i];
                }

                if(cnt >= cows) return true;
            }

            return false;
        }
    }

}
