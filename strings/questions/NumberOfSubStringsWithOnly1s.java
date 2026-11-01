package questions;

public class NumberOfSubStringsWithOnly1s {

    class Solution {
        private static final int m = 1_000_000_007;
        public int numSub(String s) {
            long c1=0;
            long count = 0;
            char[] ch = s.toCharArray();
            for(int i=0;i<ch.length;i++){
                if(ch[i]=='1'){
                    c1++;
                }
                else{
                    count+=(c1*(c1+1))/2;
                    count%=m;
                    c1=0;
                }
            }

            count+=(c1*(c1+1))/2;
            count%=m;

            return (int)count;
        }
    }
}
