package questions;

public class ShuffleString {

    class Solution {
        public String restoreString(String s, int[] indices) {
            int n = s.length();
            char[] r = new char[n];

            for(int i=0;i<n;i++){
                r[indices[i]]=s.charAt(i);
            }

            return String.valueOf(r);
        }
    }
}
