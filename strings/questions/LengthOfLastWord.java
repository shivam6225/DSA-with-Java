package questions;

public class LengthOfLastWord {

    class Solution {
        public int lengthOfLastWord(String s) {
            int right = s.length()-1;

            while(right>0 && s.charAt(right)==' ') right--;
            int spaceIdx=-1;
            for(int i=0;i<right;i++){
                if(s.charAt(i)==' '){
                    spaceIdx=i;
                }
            }
            return right-spaceIdx;
        }
    }
}
