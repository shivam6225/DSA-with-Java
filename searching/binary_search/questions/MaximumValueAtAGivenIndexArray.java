package binary_search.questions;

public class MaximumValueAtAGivenIndexArray {

    class Solution {
        public int maxValue(int n, int index, int maxSum) {

            int left = maxSum/n;
            int right = maxSum;


            while(left<right){
                int mid = (left+right+1)/2;

                if(getSum(n,index,mid)<=maxSum){
                    left=mid;
                }
                else{
                    right = mid-1;
                }
            }

            return left;

        }

        public long partSum(long count,long value){
            if(count==0) return 0;

            long start = value -1;

            if(count<=start){
                long end = start-count+1;
                return (start+end)*count/2;
            }
            else {
                long sum = start*(start+1)/2;
                long flatsum = count - start ;
                return sum+flatsum;
            }

        }

        public long getSum(int n , int index , int value){
            long leftSum = partSum(index,value);
            long rightSum = partSum(n-1-index,value);
            return leftSum+rightSum+value;
        }




    }
}
