package questions;

public class CheckIfBinaryStringHasAtMost1SegementOfOnes {

    class Solution {
        public boolean checkOnesSegment(String s) {
            char[] ch = s.toCharArray();
            boolean seen = false;

            for(int i=0;i<ch.length;i++){
                if(ch[i]=='0'){
                    seen=true;
                }
                else if(seen){
                    return false;
                }
            }

            return true;
        }
    }
}
