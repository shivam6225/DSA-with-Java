package questions;

public class ReverseWordsInAStringIII {

    class Solution {
        public String reverseWords(String s) {
            int lastIdx = -1;
            char[] charArray = s.toCharArray();
            int len = s.length();

            for(int i=0;i<=len;i++){
                if(i==len||charArray[i]==' '){
                    int start = lastIdx + 1;
                    int end = i-1;
                    while(start<end){
                        char temp = charArray[start];
                        charArray[start] = charArray[end];
                        charArray[end] = temp;
                        start++;
                        end--;
                    }
                    lastIdx = i;
                }
            }

            return new String(charArray);
        }
    }
}
