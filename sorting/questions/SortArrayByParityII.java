package questions;

public class SortArrayByParityII {

    class Solution {
        public int[] sortArrayByParityII(int[] nums) {

            int i = 0;
            int j = 1;
            int n = nums.length;

            while(i<=n-1){
                if(nums[i]%2==0)
                    i+=2;
                else {
                    while(nums[j]%2==1){
                        j+=2;
                    }
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i+=2;
                }
            }

            return nums;

        }
    }
}
