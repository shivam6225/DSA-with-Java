package questions;

public class RobustReturnToOrigin {

    class Solution {
        public boolean judgeCircle(String moves) {
            int rpos = 0;
            int cpos = 0;

            for(char move : moves.toCharArray()){
                if(move=='U'){
                    rpos--;
                }
                else if(move=='D'){
                    rpos++;
                }
                else if(move=='L'){
                    cpos++;
                }
                else {
                    cpos--;
                }
            }

            return rpos==0 && cpos==0;
        }
    }
}
