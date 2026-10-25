package questions;
import java.util.*;

public class SortArrayByIncreasingFrequency {
    class Solution {
        public int[] frequencySort(int[] nums) {
            Map<Integer,Integer> freq = new HashMap<>();
            int n = nums.length;
            for(int num:nums){
                freq.put(num,freq.getOrDefault(num,0)+1);
            }

            Integer[] numsObj = new Integer[nums.length];

            for(int i=0;i<n;i++){
                numsObj[i]=nums[i];
            }

            Arrays.sort(numsObj , (a,b)->{
                if(freq.get(a).equals(freq.get(b))){
                    return Integer.compare(b,a);
                }

                return Integer.compare(freq.get(a),freq.get(b));
            });

            for(int i=0;i<n;i++){
                nums[i]=numsObj[i];
            }

            return nums;
        }
    }
}
