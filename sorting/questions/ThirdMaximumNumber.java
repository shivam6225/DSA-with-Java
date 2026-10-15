package questions;

public class ThirdMaximumNumber {

    class Solution {
        public int thirdMax(int[] nums) {

            return bubbleSort(nums);

        }

        int bubbleSort(int[] arr){
            int count = 0;
            int num = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                if(count==0) {
                    num = arr[arr.length-1];
                    count++;
                }
                else if(num > arr[arr.length-i-1] && count<3){
                    num = arr[arr.length-i-1];
                    count++;
                }
                if(count==3) return num;
            }

            return arr[arr.length-1];
        }
    }
}
