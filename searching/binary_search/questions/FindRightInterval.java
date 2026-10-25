package binary_search.questions;
import java.util.*;

public class FindRightInterval {

    class Solution {
        public int[] findRightInterval(int[][] intervals) {
            int n = intervals.length;
            int[][] start = new int[n][2];

            for(int i=0;i<n;i++){
                start[i][0]=intervals[i][0];
                start[i][1]=i;
            }

            Arrays.sort(start , (a,b)-> Integer.compare(a[0],b[0]));

            int[] results = new int[n];

            for(int i=0;i<n;i++){
                int left = 0;
                int right = n-1;
                int idx = -1;
                int target = intervals[i][1];
                while(left<=right){
                    int mid = left+(right-left)/2;

                    if(start[mid][0] >= target){
                        idx=mid;
                        right = mid-1;
                    }
                    else{
                        left=mid+1;
                    }
                }

                results[i] = idx!=-1 ? start[idx][1] : idx;
            }

            return results;
        }
    }
}
