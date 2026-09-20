package binary_search.questions;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;

        System.out.println("Split Sum: "+ splitArray(arr,k));

    }

    private static int splitArray(int[] nums, int k) {
        int start =0;
        int end =0;

        for(int num:nums){
            start = Math.max(num,start);
            end+=num;
        }

        //binary search
        while(start<end){
            // try for middle as my potential answer
            int mid = start + (end-start)/2;

            //calculate how many pieces , we can divide  this in with max sum
            int sum =0;
            int pieces =1;
            for(int num:nums){
                if(sum+num > mid) {
                    //make new array
                    sum = num;
                    pieces++;
                }
                else {
                    sum+=num;
                }
            }
            if(pieces > k) start = mid+1;
            else end = mid;
        }

        return end;
    }
}
