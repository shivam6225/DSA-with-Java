package questions;

import java.util.*;

public class MinimumTimeDifference {

    class Solution {
        public int findMinDifference(List<String> timePoints) {
            int n=timePoints.size();
            int[] mins = new int[n];

            for(int i=0;i<n;i++){
                mins[i]=convertMin(timePoints.get(i));
            }

            Arrays.sort(mins);

            int mdiff=Integer.MAX_VALUE;

            for(int i=1;i<n;i++){
                int diff = mins[i]-mins[i-1];
                mdiff = Math.min(mdiff,diff);
            }

            return Math.min(mdiff,24*60-mins[n-1]+mins[0]);
        }


        public int convertMin(String a){
            int hour = (a.charAt(0)-'0')*10 + (a.charAt(1)-'0');
            int min = (a.charAt(3)-'0')*10 + (a.charAt(4)-'0');

            return hour*60+min;
        }
    }
}
