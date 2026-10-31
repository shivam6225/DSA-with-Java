package questions;

public class NextGreaterElementIII {

    class Solution {
        public int nextGreaterElement(int n) {

            char[] nums = String.valueOf(n).toCharArray();
            int len = nums.length;
            if(len <=1 ) return -1;

            int i = len - 2;
            while(i>=0 && nums[i+1] <= nums[i])
            {
                i--;
            }

            if(i<0) return -1;

            int j = len -1;

            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);

            reverse(nums,i+1,len-1);

            try {
                return Integer.parseInt(new String(nums));
            }
            catch (Exception e){
                return -1;
            }

        }

        public void reverse(char[] nums , int idx, int end){
            while(idx<end){
                swap(nums,idx,end);
                idx++;
                end--;
            }
        }

        public void swap(char[] nums,int i , int j){
            char temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
