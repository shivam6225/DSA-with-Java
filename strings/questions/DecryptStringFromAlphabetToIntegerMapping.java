package questions;

public class DecryptStringFromAlphabetToIntegerMapping {
    class Solution {
        public String freqAlphabets(String s) {

            StringBuilder sb = new StringBuilder();
            int i=0;

            while(i<s.length()){
                if(i+2<s.length() && s.charAt(i+2)=='#'){
                    int a = s.charAt(i)-'0';
                    int b = s.charAt(i+1)-'0';
                    sb.append((char)('a'+(a*10+b)-1));
                    i+=2;
                }
                else{
                    int num = s.charAt(i) -'0';
                    sb.append((char)('a'+num-1));
                }
                i++;
            }

            return sb.toString();
        }
    }
}
