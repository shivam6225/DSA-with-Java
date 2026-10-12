package questions;

public class AssignCookies {

    class Solution {
        public int findContentChildren(int[] g, int[] s) {


            int m = g.length;
            int n = s.length;
            quickSort(g,0,m-1);
            quickSort(s,0,n-1);
            int i =0 ,j=0;
            int count = 0;

            while(i<m && j<n){
                if(s[j]>=g[i]){
                    count++;
                    i++;
                }
                j++;
            }

            return count;
        }

        void quickSort(int[] nums,int low,int high){
            if(low>=high) return;
            int start = low;
            int end = high;
            int mid = start + (end-start)/2;
            int pivot = nums[mid];

            while(start<=end){
                while(nums[start]<pivot) start++;

                while(nums[end]>pivot) end--;

                if(start<=end){
                    int temp = nums[start];
                    nums[start]=nums[end];
                    nums[end]=temp;
                    start++;
                    end--;
                }
            }

            quickSort(nums,low,end);
            quickSort(nums,start,high);
        }
    }
}
