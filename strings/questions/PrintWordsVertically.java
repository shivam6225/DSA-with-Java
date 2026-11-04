package questions;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {

    class Solution {
        public List<String> printVertically(String s) {
            String[] ch = s.split(" ");

            int max = 0;
            for(String h:ch){
                max = Math.max(max,h.length());
            }
            List<String> str = new ArrayList<>();
            int n=ch.length;

            for(int i=0;i<max;i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<n;j++){
                    if(i<ch[j].length()){
                        sb.append(ch[j].charAt(i));
                    }
                    else {
                        sb.append(" ");
                    }
                }
                int len = sb.length();
                while(len>0 && sb.charAt(len-1)==' '){
                    sb.setLength(len-1);
                    len--;
                }
                str.add(sb.toString());
            }

            return str;
        }
    }
}
