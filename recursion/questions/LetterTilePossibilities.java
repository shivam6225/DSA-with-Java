package questions;

import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {

    class Solution {
        public int numTilePossibilities(String tiles) {

            Set<String> set = new HashSet<>();
            int size = tiles.length();
            boolean[] used = new boolean[size];
            char[] t=tiles.toCharArray();
            generate("",used,t,set);

            return set.size()-1;

        }

        public void generate(String s,boolean[] used,char[] t,Set<String> set){

            set.add(s);

            for(int i=0;i<t.length;i++){
                if(!used[i]){
                    used[i]=true;
                    generate(s+t[i],used,t,set);
                    used[i]=false;
                }
            }
        }
    }
}
