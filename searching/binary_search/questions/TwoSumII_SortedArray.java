package binary_search.questions;

public class TwoSumII_SortedArray {

        public int[] twoSum(int[] numbers, int target) {
            int start =0;
            int end = numbers.length-1;

            while(start<end){
                if(numbers[start]+numbers[end]==target)
                    return new int[]{start+1,end+1};
                if(numbers[start]+numbers[end]<target)
                    start++;
                else if(numbers[start]+numbers[end]>target)
                    end--;
            }

            return new int[]{-1,-1};
        }
}
