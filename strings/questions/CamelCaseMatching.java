package questions;

import java.util.ArrayList;
import java.util.List;

public class CamelCaseMatching {
    class Solution {
        public List<Boolean> camelMatch(String[] queries, String pattern) {
            List<Boolean> res = new ArrayList<>();

            for(String query:queries){
                res.add(check(query,pattern));
            }

            return res;
        }

        public boolean check(String s,String p){
            int i=0;
            int j=0;

            while(i<p.length() && j<s.length()){
                char sh=s.charAt(j);
                char ph=p.charAt(i);
                if(sh>='A' && sh<='Z'){
                    if(sh==ph){
                        i++;
                    }
                    else{
                        return false;
                    }
                }
                else if(ph>='a' && ph<='z'){
                    if(sh==ph){
                        i++;
                    }
                }
                j++;
            }

            while(j<s.length()){
                char sh=s.charAt(j);
                if(sh>='A' && sh<='Z'){
                    return false;
                }
                j++;
            }

            return i==p.length();
        }
    }
}
