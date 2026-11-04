package questions;

public class SentenceSimilarityII {

    class Solution {
        public boolean areSentencesSimilar(String sentence1, String sentence2) {
            String[] s1 = sentence1.split(" ");
            String[] s2 = sentence2.split(" ");

            int i=0;
            int j=0;
            while(i<s1.length && j<s2.length && s1[i].equals(s2[j])){
                i++;
                j++;
            }

            if(i==s1.length||j==s2.length) return true;

            int k=s1.length-1;
            int l=s2.length-1;
            while(k>=0 && l>=0 && s1[k].equals(s2[l])){
                k--;
                l--;
            }

            int a = i+(s1.length-1-k);
            int b = j+(s2.length-1-l);
            return a>=s1.length || b>=s2.length;
        }
    }
}
