package questions;

public class CountNumberOfHomogenousSubstrings {

    class Solution {
        public static final int k = 1_000_000_007;
        public int countHomogenous(String s) {
            if(s.isEmpty()) return 0;
            int m = s.length();
            char[] ch = s.toCharArray();
            int i=1;
            int scount=0;
            int sum=1;

            while(i<m){
                if(ch[i]==ch[i-1]){
                    scount++;
                }
                else{
                    scount=0;
                }
                sum=(sum+scount+1)%k;
                i++;
            }

            return sum;
        }
    }
}
