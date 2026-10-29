package questions;

public class ReversePrefixOfAWord {

    class Solution {
        public String reversePrefix(String word, char ch) {
            int idx = findIndex(word,ch);

            if(idx<=0) return word;

            String reversed = reverse(word,idx);

            return reversed;
        }

        public String reverse(String word,int idx){
            StringBuilder sb = new StringBuilder();
            int right = idx;
            while(right>=0){
                sb.append(word.charAt(right));
                right--;
            }

            sb.append(word.substring(idx+1,word.length()));

            return sb.toString();

        }

        public int findIndex(String word,char ch){
            int idx = -1;

            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==ch){
                    idx = i;
                    break;
                }
            }

            return idx;
        }
    }
}
