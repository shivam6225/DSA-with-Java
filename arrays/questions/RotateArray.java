package questions;

public class RotateArray {


    public void rotate(int[] nums, int k) {

        int[] nNum = new int[nums.length];
        int l = 0;
        int len = nums.length;
        k = k%len;
        while(l<len){
            if(l<k){
                nNum[l]=nums[len+l-k];
            }
            else {
                nNum[l]=nums[l-k];
            }
            l++;
        }

        for(int i=0;i<len;i++){
            nums[i]=nNum[i];
        }


    }

        //second approach
        public void rotate2(int[] nums, int k) {

            int len = nums.length;
            k = k%len;
            reverse(nums,0,len-1);
            reverse(nums,0,k-1);
            reverse(nums,k,len-1);

        }

        public void reverse(int[] nums,int start , int end){
            while(start<end){
                int temp = nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }


}
