package questions;

public class ReverseWordsInAString {

    class Solution {
        public String reverseWords(String s) {
            String[] words = s.trim().split(" ");
            StringBuilder sb = new StringBuilder();
            for(int i=words.length-1;i>=0;i--){
                if(!words[i].isEmpty()){
                    sb.append(words[i]).append(" ");
                }
            }

            return sb.toString().trim();
        }
    }


    class Solution2 {
        public String reverseWords(String s) {
            StringBuilder sb = trim(s);

            reverse(sb,0,sb.length()-1);
            reverseWords(sb);

            return sb.toString();
        }

        public StringBuilder trim(String s){
            int left=0,right=s.length()-1;

            while(left<=right && s.charAt(left)==' ') left++;
            while(left<=right && s.charAt(right)==' ') right--;

            StringBuilder sb = new StringBuilder();
            while(left<=right){
                char ch = s.charAt(left);
                if(ch!=' ')
                    sb.append(ch);
                else if(sb.charAt(sb.length()-1)!=' ')
                    sb.append(ch);
                left++;
            }

            return sb;
        }

        public void reverse(StringBuilder sb,int left,int right){
            while(left<right){
                char temp = sb.charAt(left);
                sb.setCharAt(left,sb.charAt(right));
                sb.setCharAt(right,temp);
                left++;
                right--;
            }
        }

        public void reverseWords(StringBuilder sb){
            int len=sb.length();

            int start=0,end=0;

            while(start<len){
                while(end<len && sb.charAt(end)!=' ') end++;
                reverse(sb,start,end-1);
                start=end+1;
                end++;
            }
        }
    }
}
