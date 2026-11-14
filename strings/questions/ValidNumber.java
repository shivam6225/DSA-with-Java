package questions;

public class ValidNumber {

    class Solution {
        public boolean isNumber(String s) {

            int i=0;
            boolean seenD = false;
            boolean seenE = false;
            boolean seenDt = false;

            while(i<s.length()){
                if(s.charAt(i)=='-' || s.charAt(i)=='+'){
                    if(i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E') return false;
                    i++;
                }
                else if((s.charAt(i)=='e' || s.charAt(i)=='E')){
                    if(seenE || !seenD) return false;
                    seenE=true;
                    seenD=false;
                    i++;
                }
                else if(s.charAt(i)=='.'){
                    if(seenDt || seenE) return false;
                    seenDt = true;
                    i++;
                }
                else if(Character.isDigit(s.charAt(i))) {
                    while(i<s.length() && Character.isDigit(s.charAt(i))){
                        i++;
                    }
                    seenD=true;
                }
                else{
                    return false;
                }
            }

            return seenD;
        }
    }
}
