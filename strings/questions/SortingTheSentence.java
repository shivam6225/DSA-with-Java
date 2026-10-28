package questions;

public class SortingTheSentence {

    class Solution {
        public String sortSentence(String s) {
            String[] words = s.split(" ");
            String[] ords = new String[words.length];
            for(String word:words){
                int n=word.charAt(word.length()-1)-'0';
                ords[n-1] = word.substring(0,word.length()-1);
            }
            int i=0;
            StringBuilder sb = new StringBuilder();
            for(i=0;i<ords.length-1;i++){
                sb.append(ords[i]).append(" ");
            }
            sb.append(ords[i]);

            return sb.toString();
        }

    }
}
