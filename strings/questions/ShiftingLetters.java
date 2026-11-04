package questions;

public class ShiftingLetters {
    class Solution {
        private static final String w ="abcdefghijklmnopqrstuvwxyz";
        public String shiftingLetters(String s, int[] shifts) {

            char[] ch = s.toCharArray();
            int n = shifts.length-1;
            int num = ((int)ch[n]%97 + shifts[n])%26;
            ch[n] = w.charAt(num);
            for(int i=n-1;i>=0;i--){
                shifts[i]=(shifts[i]+shifts[i+1])%26;
                num = ((int)ch[i]%97 + shifts[i])%26;
                ch[i] = w.charAt(num);
            }

            return String.valueOf(ch);
        }
    }
}
