package questions;

public class NumberOfWaysToSplitAString {

    class Solution {
        private static final int m = 1_000_000_007;
        public int numWays(String s) {
            int count1 = 0;
            int n =s.length();

            for(int i=0;i<n;i++){
                count1+=s.charAt(i)-'0';
            }

            if(count1%3!=0) return 0;

            if(count1==0) return (int)((n-2L)*(n-1L)/2%m);

            long numWaysOne = 0;
            long numWaysTwo =0;
            int bcount = 0;

            int block = count1/3;

            for(int i=0;i<n;i++){
                bcount+=s.charAt(i)-'0';
                if(bcount==block){
                    numWaysOne++;
                }
                else if(bcount==block*2){
                    numWaysTwo++;
                }
            }

            return (int)(numWaysOne*numWaysTwo%m);
        }
    }
}
